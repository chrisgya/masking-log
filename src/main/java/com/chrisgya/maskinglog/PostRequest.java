package com.chrisgya.maskinglog;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PostRequest {
    private String firstName;
    private String lastName;
    private String password;
    private String confirmPassword;
    private LocalDate birthDate;
    private String identityNumber;
}

