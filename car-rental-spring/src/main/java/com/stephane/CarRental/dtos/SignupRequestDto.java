package com.stephane.CarRental.dtos;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class SignupRequestDto {

    @NotEmpty(message = "The full name is required.")
    private String name;

    @NotEmpty(message = "The email address is required.")
    @Email(message = "The email address is invalid.", flags = { Pattern.Flag.CASE_INSENSITIVE })
    private String email;

    @NotEmpty(message = "The password is required. Choose one")
    private String password;
}