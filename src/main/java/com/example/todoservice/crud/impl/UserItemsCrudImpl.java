package com.example.todoservice.crud.impl;

import com.example.todoservice.crud.Crud;
import com.example.todoservice.dao.UserItemsDao;
import com.example.todoservice.models.UserItems_;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserItemsCrudImpl implements Crud<UserItems_> {

    private UserItemsDao userItemsDao;

    @Override
    public void save(UserItems_ o) {
        double firstNumbersInUserItemsId = Math.random() * 220 * 5;
        double secondNumbersInUserItemsId = Math.random() * 220 * 5;
        o.setId(firstNumbersInUserItemsId + "" + o.getItemName() + "" + o.getUserWhoHavaItem().getName() + "" + secondNumbersInUserItemsId);
        userItemsDao.save(o);
    }

    @Override
    public void delete(UserItems_ o) {
        userItemsDao.delete(o);
    }

    @Override
    public void update(UserItems_ o) {
        userItemsDao.save(o);
    }
}
