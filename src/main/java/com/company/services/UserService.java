package com.company.services;

import com.company.dto.UserRequest;
import com.company.entities.User;
import com.company.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Transactional(Transactional.TxType.SUPPORTS)
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found with id: " + id));
    }

    @Transactional
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public User updateUser(Long id, User user) {
        User foundUser = getUserById(id);
        return UserRequest.updateUser(user, foundUser);
    }

    @Transactional
    public void deleteUser(Long id) {
        User foundUser = getUserById(id);
        userRepository.delete(foundUser);
    }
}
