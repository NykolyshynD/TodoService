package com.example.todoservice.crud.impl;

import com.example.todoservice.crud.Crud;
import com.example.todoservice.dao.BucketEntityDao;
import com.example.todoservice.models.BucketEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BucketCrudImpl implements Crud<BucketEntity> {

    private BucketEntityDao userBucketDao;

    @Override
    public void save(BucketEntity o) {
        double firstNumbersInUserBucketId = Math.random() * 223 * 5;
        double secondNumbersInUserBucketId = Math.random() * 223 * 5;
        o.setId(firstNumbersInUserBucketId + "" + o.getUserWhoHaveBucket().getName() + o.getUserItem().getName() + "" + secondNumbersInUserBucketId);
        userBucketDao.save(o);
    }

    @Override
    public void delete(BucketEntity o) {
        userBucketDao.delete(o);
    }

    @Override
    public void update(BucketEntity o) {
        userBucketDao.save(o);
    }
}
