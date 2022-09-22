package com.example.todoservice.crud.impl;


import com.example.todoservice.crud.Crud;
import com.example.todoservice.dao.UserDao;
import com.example.todoservice.models.User_;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserCrudImpl implements Crud<User_> {

    private UserDao userDao;

    @Override
    public void save(User_ o) {
        double firstNumbersInUserId = Math.random() * 123 * 5;
        double secondNumbersInUserId = Math.random() * 123 * 5;
        o.setId(firstNumbersInUserId + o.getName() + secondNumbersInUserId);
        userDao.save(o);
    }

    @Override
    public void delete(User_ o) {
        userDao.delete(o);
    }

    @Override
    public void update(User_ o) {
        userDao.save(o);
    }
}
