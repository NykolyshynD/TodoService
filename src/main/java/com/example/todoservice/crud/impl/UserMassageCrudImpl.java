package com.example.todoservice.crud.impl;

import com.example.todoservice.crud.Crud;
import com.example.todoservice.dao.UserMassageDao;
import com.example.todoservice.models.UserMassage_;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserMassageCrudImpl implements Crud<UserMassage_> {

    private UserMassageDao userMassageDao;

    @Override
    public void save(UserMassage_ o) {
        double firstNumbersInUserMassageId = Math.random() * 233 * 5;
        double secondNumbersInUserMassageId = Math.random() * 233 * 5;
        o.setId(firstNumbersInUserMassageId + "" + o.getUserWhoSendMassage().getName() + "" + o.getMassage() + secondNumbersInUserMassageId);
        userMassageDao.save(o);
    }

    @Override
    public void delete(UserMassage_ o) {
        userMassageDao.delete(o);
    }

    @Override
    public void update(UserMassage_ o) {
        userMassageDao.save(o);
    }
}
