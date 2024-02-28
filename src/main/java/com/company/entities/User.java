package com.company.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 3, max = 20)
    private String firstName;
    @Size(min = 3, max = 20)
    private String lastName;
    @NotBlank
    @Email
    @Column(unique = true, updatable = false)
    private String email;
    @NotBlank
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$",
            message = "Password must contain at least 1 uppercase letter, 1 lowercase letter, and 1 digit, with a minimum length of 8 characters")
    private String password;
    @NotNull
    @Min(value = 18, message = "required minimum age 18")
    private Integer age;
    @NotNull
    private LocalDate birthDate;
}
