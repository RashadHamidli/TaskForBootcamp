package com.company.services;

import com.company.dto.request.UserRequest;
import com.company.dto.responce.UserResponse;
import com.company.entities.User;
import com.company.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public List<UserResponse> getAllUser() {
        List<User> user = userRepository.findAll();
        return user.stream().map(UserResponse::convertUserToUserResponse).collect(Collectors.toList());
    }

    @Transactional
    public UserResponse getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found with id: " + id));
        return UserResponse.convertUserToUserResponse(user);
    }

    @Transactional
    public UserResponse createUser(UserRequest userRequest) {
        User user = UserRequest.converteUser(userRequest);
        User saveUser = userRepository.save(user);
        return UserResponse.convertUserToUserResponse(saveUser);
    }

    @Transactional
    public UserResponse updateUser(Long id, UserRequest userRequest) {
        User user = UserRequest.converteUser(userRequest);
        User userFound = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("user not found"));
        User updatedUser = UserRequest.updateUser(user, userFound);
        User savedUser = userRepository.save(updatedUser);
        return UserResponse.convertUserToUserResponse(savedUser);
    }

    @Transactional
    public void deleteUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("user not found"));
        userRepository.delete(user);
    }
}
