package com.company.services;

import com.company.entities.User;
import com.company.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Transactional(Transactional.TxType.SUPPORTS)
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Transactional
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public User updateUser(Long id, User user) {
        User foundUser = getUserById(id);

        return userRepository.save(user);
    }
}
