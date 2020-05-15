package org.example.jdbc.crud;

import org.example.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {

    public void readRows(){

        ConnectionManager connectionManager = new ConnectionManager();
        Connection connection = connectionManager.getConnection();

        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM test";

            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("First Name, Last Name");
            while (resultSet.next()){
                System.out.print(resultSet.getObject(1)+" ");
                System.out.println(resultSet.getObject(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
