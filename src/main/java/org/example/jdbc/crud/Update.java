package org.example.jdbc.crud;

import org.example.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    public void updateRows() {

        ConnectionManager connectionManager = new ConnectionManager();
        Connection connection = connectionManager.getConnection();

        {
            try {
                String query = "UPDATE test SET FirstName=? WHERE FirstName=?";
                PreparedStatement statement = connection.prepareStatement(query);

                statement.setString(1, "Ganda");
                statement.setString(2, "Big");

                statement.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
