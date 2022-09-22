package com.example.todoservice.mappers;

import com.example.todoservice.dto.UserDto;
import com.example.todoservice.exception.HelpersException;
import com.example.todoservice.models.UserEntity;

public interface UserMapper {

    UserEntity userDtoToEntity(UserDto userDto) throws HelpersException;
    UserDto userEntityToDto(UserEntity userEntity);
}
