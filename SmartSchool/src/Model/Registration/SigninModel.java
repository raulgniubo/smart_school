
package Model.Registration;

import DBManagement.DBConnection;
import java.sql.Connection;
import DBManagement.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SigninModel {
    
    Connection connection;
    
    public SigninModel() {
        
        // checking if it is connected to the database
        try {
            this.connection = DBConnection.getConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (this.connection == null) {
            System.exit(1);
        }
        
    }
    
    public boolean isDatabaseConnected() {
        // returns true if it is connected or false if it is not
        return this.connection != null;
    }
    
    public boolean isSignin(String user, String pass) throws SQLException {
        
        PreparedStatement pr = null;
        ResultSet rs = null;
        
        String sql = "SELECT * FROM Signin where username = ? and password = ?";
        
        try {
            pr = this.connection.prepareStatement(sql);
            pr.setString(1, user);  // first one on the statement is user
            pr.setString(2, pass);  // then pass
            
            rs = pr.executeQuery();
            
            boolean boll1;
            
            if (rs.next()) {
                return true;
            }
            return false;
            
        } catch (SQLException ex) {
            return false;
        }
        
        // closing the connection to the database
        finally {
            {
                pr.close();
                rs.close();
            }
        }
        
    }
    
    public boolean isSigninUsername(String user) throws SQLException {
        
        PreparedStatement pr = null;
        ResultSet rs = null;
        
        String sql = "SELECT * FROM Signin where username = ?";
        
        try {
            pr = this.connection.prepareStatement(sql);
            pr.setString(1, user);  // first one on the statement is user
            
            rs = pr.executeQuery();
            
            boolean boll1;
            
            if (rs.next()) {
                return true;
            }
            return false;
            
        } catch (SQLException ex) {
            return false;
        }
        
        // closing the connection to the database
        finally {
            {
                pr.close();
                rs.close();
            }
        }
        
    }
    
}
