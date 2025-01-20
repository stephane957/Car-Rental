package com.stephane.CarRental.controllers;

import com.stephane.CarRental.dtos.SignupRequestDto;
import com.stephane.CarRental.dtos.UserDto;
import com.stephane.CarRental.services.AuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;


@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @Autowired
    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<?> signupCustomer(@Valid @RequestBody SignupRequestDto registeredUserDto) {
        if (authenticationService.hasCustomerWithEmail(registeredUserDto.getEmail()))
            return new ResponseEntity<>("Customer with that address email already exists", HttpStatus.NOT_ACCEPTABLE);
        UserDto createdCustomer = authenticationService.createCustomer(registeredUserDto);
        if (createdCustomer == null) {
            return new ResponseEntity<>("Customer not created. Bad request.", HttpStatus.BAD_REQUEST);
        }

        return ResponseEntity.created(URI.create("/auth/signup")).body(createdCustomer);
    }
}
