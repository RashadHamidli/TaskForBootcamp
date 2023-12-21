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
        User user=new User("Aa", "Bb", "c@mail.com", "abc");

        try (EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
             EntityManager entityManager = entityManagerFactory.createEntityManager()) {
//            entityManager.persist(user);

            User u = entityManager.find(User.class, 1);
            System.out.println(u);
//            MyServiceJPA service = new MyServiceJPA();
//            List<User> users = service.selectUsers();
//            users.stream().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace()
            e.printStackTrace();
        }
    }


}
