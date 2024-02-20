package com.company.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "users")
@Data
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "name cannot be null")
    private String name;
    @NotBlank(message = "surname cannot be null")
    private String surname;
    @NotNull(message = "age cannot be null")
    private Integer age;

    @Override
    public String toString() {
        return String.format("%d) %s, %s, %d", id, name, surname, age);
    }
}
