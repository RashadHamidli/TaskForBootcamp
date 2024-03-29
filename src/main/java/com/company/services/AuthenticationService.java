package com.company.services;

import com.company.config.AuthenticationConfig;
import com.company.dto.request.LoginRequest;
import com.company.dto.responce.LoginResponse;
import com.company.dto.request.UserRequest;
import com.company.entities.Roles;
import com.company.entities.User;
import com.company.repository.UserRepository;
import com.company.security.CustomSecurityContext;
import com.company.security.JwtService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;
    private final CustomSecurityContext securityContext;

    @Transactional
    public LoginResponse registerUser(UserRequest userRequest) {
        User user = UserRequest.converteUser(userRequest);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Roles.USER);
        userRepository.save(user);
        String token = jwtService.generateToken(user);
        return new LoginResponse(token);
    }

    public LoginResponse login(LoginRequest loginRequest) {
        Authentication authenticate = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.email(), loginRequest.password()));
        User user = userRepository.findByEmail(loginRequest.email()).orElseThrow();
        securityContext.setSecurityContext(authenticate);
        String token = jwtService.generateToken(user);
        return new LoginResponse(token);
    }

}
