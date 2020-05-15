package org.example.jdbc.crud;

import org.example.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

    public void deleteRow() {

        ConnectionManager connectionManager = new ConnectionManager();
        Connection connection = connectionManager.getConnection();

        try {
            String query = "DELETE FROM test WHERE FirstName=?";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, "Já");

            statement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
