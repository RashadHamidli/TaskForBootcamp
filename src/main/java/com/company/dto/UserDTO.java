package com.company.dto;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class UserDTO {
    private String name;
    private String surname;
    private Integer age;
}
