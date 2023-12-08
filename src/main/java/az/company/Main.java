package az.company;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        Service service = new Service();
        List<User> users = service.selectUsers();
        users.stream().forEach(user -> System.out.print(user + ", "));
    }


}
