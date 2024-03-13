package com.company.security;

import com.company.dto.LoginRequest;
import com.company.dto.LoginResponse;
import com.company.dto.UserRequest;
import com.company.entities.User;
import com.company.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Transactional
    public LoginResponse save(UserRequest userRequest) {
        User user = UserRequest.converteUser(userRequest);
        userRepository.save(user);
        String token = jwtService.generateToken(user);
        return new LoginResponse(token);
    }

    public LoginResponse login(LoginRequest loginRequest) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.email(), loginRequest.password()));
        User user = userRepository.findByEmail(loginRequest.email()).orElseThrow();
        String token = jwtService.generateToken(user);
        return new LoginResponse(token);
    }
}
