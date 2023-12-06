package com.api;

public record User(
        Long id,
        String name,
        String surname,
        String email,
        String password) {
}
