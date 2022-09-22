package com.example.todoservice.crud.impl;

import com.example.todoservice.crud.Crud;
import com.example.todoservice.dao.UserBucketDao;
import com.example.todoservice.models.UserBucket_;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserBucketCrudImpl implements Crud<UserBucket_> {

    private UserBucketDao userBucketDao;

    @Override
    public void save(UserBucket_ o) {
        double firstNumbersInUserBucketId = Math.random() * 223 * 5;
        double secondNumbersInUserBucketId = Math.random() * 223 * 5;
        o.setId(firstNumbersInUserBucketId + "" + o.getUserWhoHaveBucket().getName() + o.getUserItem().getName() + "" + secondNumbersInUserBucketId);
        userBucketDao.save(o);
    }

    @Override
    public void delete(UserBucket_ o) {
        userBucketDao.delete(o);
    }

    @Override
    public void update(UserBucket_ o) {
        userBucketDao.save(o);
    }
}
