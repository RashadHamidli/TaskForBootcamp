package az.company;

import java.sql.*;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws SQLException {
        var url = "jdbc:postgresql://127.0.0.1:5432/jdbc";
        var user = "postgres";
        var passoword = "admin";
        var queryUserTableCreate = "create table users(id int primary key , name varchar, surname varchar, email varchar)";
        var querySelectUser = "select * from users";
        try (Connection connection = DriverManager.getConnection(url, user, passoword)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(querySelectUser);
            while (resultSet.next()) {
                var id = resultSet.getInt("id");
                var name = resultSet.getString("name");
                var surname = resultSet.getString("surname");
                var email = resultSet.getString("email");
                var list = Stream.of(id, name, surname, email).toList();
                list.forEach(l -> System.out.print(l + ", "));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
