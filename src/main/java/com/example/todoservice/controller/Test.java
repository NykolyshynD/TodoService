package com.example.todoservice.controller;

import com.example.todoservice.crud.Crud;
import com.example.todoservice.dto.UserDto;
import com.example.todoservice.mappers.UserMapper;
import com.example.todoservice.models.UserEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Test {

    Crud<UserEntity> userEntityCrud;

    UserMapper userMapper;

    @GetMapping
    public UserDto saveUserTest() {
        UserEntity userEntity = new UserEntity("firstUser", "test@email.com", "18", "123", "0", "0", false);
        userEntityCrud.save(userEntity);
        return userMapper.userEntityToDto(userEntity);
    }
}
