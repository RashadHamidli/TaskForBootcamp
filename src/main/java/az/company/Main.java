package az.company;

import az.company.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        User u=new User("Aa", "Bb", "c@mail.com", "abc");

        try (EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
             EntityManager entityManager = entityManagerFactory.createEntityManager()) {
//            entityManager.persist(user);
            User user = entityManager.find(User.class, 1);
            System.out.println(user);
//            MyServiceJPA service = new MyServiceJPA();
//            List<User> users = service.selectUsers();
//            users.stream().forEach(System.out::gprintln);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
