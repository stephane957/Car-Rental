package com.stephane.CarRental.dtos;

import com.stephane.CarRental.Enums.UserRole;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {

    @NotNull(message = "Enter a valid User ID")
    private Long id;

    @NotBlank(message = "User name required")
    private String name;

    @Email(message = "The email address is invalid.", flags = { Pattern.Flag.CASE_INSENSITIVE })
    @NotNull
    private String email;

    @NotEmpty
    private String password;

    @NotNull(message = "User role required")
    private UserRole userRole;

    @NotNull(message = "Timestamp required")
    private Date createdAt;
}
