package az.company;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        Service service = new Service();
        User user = service.selectOneUser(1);
        System.out.println("user - " + user);

        var u = new User(null, "Aaa", null, "aaa@gmail.com");
        service.updateUser(1, u);

        List<User> users = service.selectUsers();
        users.stream().forEach(System.out::println);

    }


}