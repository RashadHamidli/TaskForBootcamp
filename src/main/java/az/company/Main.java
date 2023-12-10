package az.company;

import az.company.entities.User;
import az.company.services.MyServiceJPA;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try (EntityManagerFactory entityManagerFactory =
                     Persistence.createEntityManagerFactory("myPersistenceUnit");
             EntityManager entityManager = entityManagerFactory.createEntityManager()) {

            User user = entityManager.find(User.class, 2);
            System.out.println(user);
//            MyServiceJPA service = new MyServiceJPA();
//            List<User> users = service.selectUsers();
//            users.stream().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
