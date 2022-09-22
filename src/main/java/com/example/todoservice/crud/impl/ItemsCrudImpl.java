package com.example.todoservice.crud.impl;

import com.example.todoservice.crud.Crud;
import com.example.todoservice.dao.ItemsEntityDao;
import com.example.todoservice.models.ItemsEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ItemsCrudImpl implements Crud<ItemsEntity> {

    private ItemsEntityDao userItemsDao;

    @Override
    public void save(ItemsEntity o) {
        double firstNumbersInUserItemsId = Math.random() * 220 * 5;
        double secondNumbersInUserItemsId = Math.random() * 220 * 5;
        o.setId(firstNumbersInUserItemsId + "" + o.getItemName() + "" + o.getUserWhoHavaItem().getName() + "" + secondNumbersInUserItemsId);
        userItemsDao.save(o);
    }

    @Override
    public void delete(ItemsEntity o) {
        userItemsDao.delete(o);
    }

    @Override
    public void update(ItemsEntity o) {
        userItemsDao.save(o);
    }
}
