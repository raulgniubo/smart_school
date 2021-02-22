/*
 * Smart School App
 * This Application was made for students to keep track of their college duties.
 * It cannot be distributed or sold without the permission of the author.
 * @author Raul Gutierrez Niubo
 * website: raulgutierrezniubo.com
 */
package DBManagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    
    
    // Testing the connection with the database
//    public static void main(String[] args) {
//	DBConnection obj_DB_Connection = new DBConnection();
//	Connection connection = null;
//	connection = obj_DB_Connection.getConnection();
//	System.out.println(connection);
//    }
    
    private static final String USERNAME = "u399028360_rgtechpro";
    private static final String PASSWORD = "Ralphms2312!";
    private static final String DBNAME = "u399028360_Smart_School";
    private static final String HOSTNAME = "sql124.main-hosting.eu";
    private static final String DBCONN = "jdbc:mysql://" + HOSTNAME + "/" + DBNAME;
    
    public Connection getConnection() {
	Connection connection = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //connection = DriverManager.getConnection("jdbc:mysql://hostname:3306/databasename", "username", "password");
            connection = DriverManager.getConnection(DBCONN, USERNAME, PASSWORD);
	} catch (Exception e) {
            System.out.println(e);
	}
	return connection;
     }
    
    
}
