package com.company.controllers;


import com.company.dto.LoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.TestingAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginRestController {

    private final AuthenticationManager authenticationManager;

//    @PostMapping
//    public ResponseEntity<Authentication> login(@RequestBody LoginRequest loginRequest) {
//        UsernamePasswordAuthenticationToken unauthenticated =
//                UsernamePasswordAuthenticationToken.unauthenticated(loginRequest.username(), loginRequest.password());
//        Authentication authenticate = authenticationManager.authenticate(unauthenticated);
//        SecurityContextHolder.getContext().setAuthentication(authenticate);
//        return ResponseEntity.ok(authenticate);
//    }

    @PostMapping
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        Authentication authentication = new TestingAuthenticationToken("admin", "admin", "ROLE_ADMIN");
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String redirectUrl = "http://localhost:8080/api/user/all";
        return ResponseEntity.ok(redirectUrl);
    }
}




