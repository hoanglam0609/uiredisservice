package com.example.ui.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    private Long id;

    private String name;

    private int yearOfBirth;

    private String password;

    private String phone;
}
