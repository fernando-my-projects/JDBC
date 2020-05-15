package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    String url = "jdbc:mysql://localhost:3306/DB_JDBC_TEST";
    private Connection connection = null;

    /**
     * method to get/create a connection
     *
     * @return a connection
     */
    public Connection getConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(url, "root", "");
            }
        } catch (SQLException ex) {
            System.out.println("Failure to connect to database: " + ex.getMessage());
        }
        return connection;
    }

    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            System.out.println("Failure to close database connections: " + ex.getMessage());
        }
    }

}
