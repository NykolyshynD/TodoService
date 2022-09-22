package com.example.todoservice.crud.impl;

import com.example.todoservice.crud.Crud;
import com.example.todoservice.dao.FriendsEntityDao;
import com.example.todoservice.models.FriendsEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class FriendsCrudImpl implements Crud<FriendsEntity> {

    private FriendsEntityDao userFriendsDao;

    @Override
    public void save(FriendsEntity o) {
        double firstNumbersInUserFriendsId = Math.random() * 226 * 5;
        double secondNumbersInUserFriendsId = Math.random() * 226 * 5;
        o.setId(firstNumbersInUserFriendsId + "" + o.getUserFriends().size() + "" + secondNumbersInUserFriendsId);
        userFriendsDao.save(o);
    }

    @Override
    public void delete(FriendsEntity o) {
        userFriendsDao.delete(o);
    }

    @Override
    public void update(FriendsEntity o) {
        userFriendsDao.save(o);
    }
}
