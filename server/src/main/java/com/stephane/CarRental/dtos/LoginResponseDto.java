package com.stephane.CarRental.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginResponseDto {
    private String token;
    private String expiresIn;
    private Long userId;
    
}
