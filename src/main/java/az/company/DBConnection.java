package az.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        var url = "jdbc:postgresql://127.0.0.1:5432/jdbc";
        var user = "postgres";
        var passoword = "admin";
        try {
            Connection connection = DriverManager.getConnection(url, user, passoword);
            System.out.println("database connected");
            return connection;
        } catch (SQLException e) {
            var errorMessage = "database not connected";
            throw new DatabaseOperationException(errorMessage, e);
        }
    }

}
