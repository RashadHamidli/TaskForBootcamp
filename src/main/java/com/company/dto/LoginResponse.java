package com.company.dto;

import org.springframework.security.core.Authentication;

public record LoginResponse(String token) {
}
