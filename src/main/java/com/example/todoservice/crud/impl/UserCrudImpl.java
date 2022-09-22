package com.example.todoservice.crud.impl;


import com.example.todoservice.crud.Crud;
import com.example.todoservice.dao.UserEntityDao;
import com.example.todoservice.models.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserCrudImpl implements Crud<UserEntity> {

    private UserEntityDao userDao;

    @Override
    public void save(UserEntity o) {
        double firstNumbersInUserId = Math.random() * 123 * 5;
        double secondNumbersInUserId = Math.random() * 123 * 5;
        o.setId(firstNumbersInUserId + o.getName() + secondNumbersInUserId);
        userDao.save(o);
    }

    @Override
    public void delete(UserEntity o) {
        userDao.delete(o);
    }

    @Override
    public void update(UserEntity o) {
        userDao.save(o);
    }
}
