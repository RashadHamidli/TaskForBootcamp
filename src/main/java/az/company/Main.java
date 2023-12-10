package az.company;

import az.company.entities.User;
import az.company.services.MyService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        MyService myService = new MyService();
        User user = myService.selectOneUser(1);
        System.out.println("user - " + user);

    }


}
