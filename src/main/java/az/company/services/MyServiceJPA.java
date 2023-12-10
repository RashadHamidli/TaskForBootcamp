package az.company.services;

import az.company.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class MyServiceJPA {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void updateUser(Integer id, User user) {
        User foundedUser = entityManager.find(User.class, id);
        if (foundedUser != null) {
            if (user.getName() != null && !user.getName().isEmpty())
                foundedUser.setName(user.getName());
            if (user.getSurname() != null && !user.getSurname().isEmpty())
                foundedUser.setSurname(user.getSurname());
            if (user.getEmail() != null && !user.getEmail().isEmpty())
                foundedUser.setEmail(user.getEmail());
        }
    }

    @Transactional
    public User selectOneUser(Integer id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    public List<User> selectUsers() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }
}
