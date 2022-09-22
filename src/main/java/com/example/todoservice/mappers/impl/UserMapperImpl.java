package com.example.todoservice.mappers.impl;

import com.example.todoservice.dao.UserEntityDao;
import com.example.todoservice.dto.UserDto;
import com.example.todoservice.exception.HelpersException;
import com.example.todoservice.mappers.UserMapper;
import com.example.todoservice.models.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class UserMapperImpl implements UserMapper {

    private UserEntityDao userEntityDao;

    @Override
    public UserEntity userDtoToEntity(UserDto userDto) throws HelpersException {
        Optional<UserEntity> userEntity = userEntityDao.searchByName(userDto.getName());
        if (userEntity.isPresent()) {
            return userEntity.get();
        }
        throw new HelpersException("userEntity with this name not have");
    }

    @Override
    public UserDto userEntityToDto(UserEntity userEntity) {
        return new UserDto(userEntity.getName(), userEntity.getEmail(), userEntity.getAge());
    }
}
