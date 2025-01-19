package com.stephane.CarRental.dtos;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class RegisterUserDto {

    @NotEmpty(message = "The full name is required.")
    @Size(min = 2, max = 100, message = "The length of full name must be between 2 and 100 characters.")
    private String name;

    @NotEmpty(message = "The email address is required.")
    @Email(message = "The email address is invalid.", flags = { Pattern.Flag.CASE_INSENSITIVE })
    private String email;

    @NotEmpty(message = "The password is required. Choose one")
    private String password;
}
