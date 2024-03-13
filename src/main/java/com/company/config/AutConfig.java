package com.company.config;

import com.company.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@RequiredArgsConstructor
public class AutConfig {
private final UserRepository userRepository;
    @Bean
    public UserDetailsService userDetailsService() {
        return email -> userRepository.findByEmail(email).orElseThrow(()->new UsernameNotFoundException("user not found"));
    }
}
