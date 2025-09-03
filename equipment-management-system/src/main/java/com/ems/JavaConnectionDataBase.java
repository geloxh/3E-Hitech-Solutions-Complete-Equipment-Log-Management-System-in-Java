package com.ems;

/**
 * 
 * @author geloxh
 * 
 */

import java.sql.*;
import javax.swing.JOptionPane;
 
public class JavaConnectionDataBase {
    
    public static Connection connectToDatabase () {
        Connection connection = null;
        ResultSet resultSet;
        PreparedStatement preparedStatement;
        try {
            // A configuration string to store information of database
            String dbUrl = "";
            Class.forName(""); // A driver to help with the connection to database
            connection = DriverManager.getConnection(dbUrl);
            // Create a connection from the information from string dbUrl
            if (connection != null) {
                DatabaseMetaData dm = (DatabaseMetaData) connection.getMetaData();
                System.out.println("Driver Name: " + dm.getDriverName());
                System.out.println("Driver Version: " + dm.getDriverVersion());
                System.out.println("Product Name: " + dm.getDatabaseProductName());
                System.out.println("Product Version: " + dm.getDatabaseProductVersion());
            }
            return connection;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
