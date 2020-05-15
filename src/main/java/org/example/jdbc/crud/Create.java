package org.example.jdbc.crud;

import org.example.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Create {

    public void createRow() {

        ConnectionManager connectionManager = new ConnectionManager();
        Connection connection = connectionManager.getConnection();

        try {
            String query = "INSERT INTO test (FirstName, LastName) VALUES (?, ?);";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, "Já");
            statement.setString(2, "Foste");

            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }


}
