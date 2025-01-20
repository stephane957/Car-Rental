package com.stephane.CarRental.services;

import com.stephane.CarRental.enums.UserRole;
import com.stephane.CarRental.dtos.SignupRequestDto;
import com.stephane.CarRental.dtos.UserDto;
import com.stephane.CarRental.entities.User;
import com.stephane.CarRental.mappers.UserMapper;
import com.stephane.CarRental.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthenticationService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public UserDto createCustomer(SignupRequestDto userInput) {
        User user = new User();
        user.setName(userInput.getName());
        user.setEmail(userInput.getEmail());
        user.setPassword(userInput.getPassword());
        user.setUserRole(UserRole.CUSTOMER);
        return userMapper.toUserDto(userRepository.save(user));
    }

    public boolean hasCustomerWithEmail(String email) {
        return userRepository.findFirstByEmail(email).isPresent();
    }
}