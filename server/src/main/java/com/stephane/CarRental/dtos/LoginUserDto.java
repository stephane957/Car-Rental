package com.stephane.CarRental.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginUserDto {

    @NotEmpty
    private String email;

    @NotEmpty
    private String password;
}
