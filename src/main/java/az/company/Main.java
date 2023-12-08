package az.company;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DBConnection.getConnection();
        System.out.println("connection: " + connection);
        System.out.println("connection.getCatalog(): " + connection.getCatalog());
        System.out.println("connection.getClientInfo(): " + connection.getClientInfo());
        System.out.println("connection.getMetaData(): " + connection.getMetaData());
        System.out.println("connection.getSchema(): " + connection.getSchema());
        System.out.println("connection.getWarnings(): " + connection.getWarnings());
    }
}
