package az.company;

import az.company.entities.User;
import az.company.services.Service;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        Service service = new Service();
        User user = service.selectOneUser(1);
        System.out.println("user - " + user);

    }


}
