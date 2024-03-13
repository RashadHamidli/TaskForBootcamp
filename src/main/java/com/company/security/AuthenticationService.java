package com.company.security;

import com.company.dto.LoginResponse;
import com.company.dto.UserRequest;
import com.company.entities.User;
import com.company.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;

    public LoginResponse save(UserRequest userRequest) {
        User user = UserRequest.converteUser(userRequest);
        userRepository.save(user);
    }
}
