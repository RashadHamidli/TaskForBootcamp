package com.company.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jdk.jfr.Timestamp;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 3)
    private String name;
    @NotBlank
    @Column(columnDefinition = "text")
    private String text;
    @NotNull
    private LocalDate deadline;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
