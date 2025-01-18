package com.stephane.CarRental.mappers;

import com.stephane.CarRental.dtos.UserDto;
import com.stephane.CarRental.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(UserDto userDto);

    UserDto toUserDto(User user);
}
