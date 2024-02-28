package com.company.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("user")
                .password(passwordEncoder().encode("user"))
                .roles("USER")
                .build());
        manager.createUser(User.withUsername("admin")
                .password(passwordEncoder()
                        .encode("admin"))
                .roles("USER", "ADMIN")
                .build());
        return manager;
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/login", "/logout").permitAll()
                        .requestMatchers("/api/book/**").hasRole("ADMIN")
                        .anyRequest().authenticated()
                )
                .formLogin(login -> {
                    login.loginPage("/login");
                    login.loginProcessingUrl("/perform_login");
                    login.defaultSuccessUrl("/homepage.url",true);
                    login.failureUrl("/login.html?error=true");
                })
                .logout(logout->{
                    logout.logoutUrl("/logout");
                    logout.deleteCookies("JSESSIONID");
                })
                .httpBasic(withDefaults());
        return http.build();
    }
}
