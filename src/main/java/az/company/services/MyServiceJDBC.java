package az.company.services;

import az.company.entities.User;
import az.company.util.DBConnectionUtil;
import az.company.exceptions.DatabaseOperationException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyServiceJDBC {
    public void updateUser(Integer id, User user) {
        try (Connection connection = DBConnectionUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE users SET name=?, surname=?, email=? WHERE id=?")) {
            if (user.getName() != null && !user.getName().isEmpty())
                preparedStatement.setString(1, user.getName());
            else
                preparedStatement.setNull(1, Types.VARCHAR);
            if (user.getSurname() != null && !user.getSurname().isEmpty())
                preparedStatement.setString(2, user.getSurname());
            else
                preparedStatement.setNull(2, Types.VARCHAR);
            if (user.getEmail() != null && !user.getEmail().isEmpty())
                preparedStatement.setString(3, user.getEmail());
            else
                preparedStatement.setNull(3, Types.VARCHAR);
            preparedStatement.setInt(4, id);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("user successfully update");
            } else {
                System.out.println("user not update");
            }
        } catch (SQLException e) {
            var errorMessage = "user not update";
            throw new DatabaseOperationException(errorMessage, e);
        }
    }

    public User selectOneUser(Integer id) {
        User user = null;
        try (Connection connection = DBConnectionUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    var name = resultSet.getString("name");
                    var surname = resultSet.getString("surname");
                    var email = resultSet.getString("email");
                    user = new User(id, name, surname, email, null);
                }
            }
        } catch (SQLException e) {
            var errorMessage = "istifadeci tapilmadi! ";
            throw new DatabaseOperationException(errorMessage, e);
        }
        return user;
    }

    public List<User> selectUsers() {
        ArrayList<User> list = new ArrayList<>();

        try (Connection connection = DBConnectionUtil.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from users")) {
            while (resultSet.next()) {
                var id = resultSet.getInt("id");
                var name = resultSet.getString("name");
                var surname = resultSet.getString("surname");
                var email = resultSet.getString("email");
                var user = new User(id, name, surname, email, null);
                list.add(user);
            }
        } catch (SQLException e) {
            String errorMessage = "xeta bas verdi: " + e.getMessage();
            throw new DatabaseOperationException(errorMessage, e);
        }
        return list;
    }
}