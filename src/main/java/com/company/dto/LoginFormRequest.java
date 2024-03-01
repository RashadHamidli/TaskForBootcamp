package com.company.dto;

import lombok.Data;

@Data
public class LoginFormRequest {
    private String email;
    private String password;
}
