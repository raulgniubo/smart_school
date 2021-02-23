/*
 * Smart School App
 * This Application was made for students to keep track of their college duties.
 * It cannot be distributed or sold without the permission of the author.
 * @author Raul Gutierrez Niubo
 * website: raulgutierrezniubo.com
 */
package Model.Registration;

import DBManagement.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;

public class RegistrationModel {
    
    Connection connection;
    
    public RegistrationModel() {
        // checking if it is connected to the database
        try {
            this.connection = DBConnection.getConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        if (this.connection == null) {
            // System.exit(1);
            // Connection failed
            System.out.println("Connection with the database failed!");
        }
    }
    
    public boolean isDatabaseConnected() {
        // returns true if it is connected or false if it is not
        return this.connection != null;
    }
    
    
    
}
