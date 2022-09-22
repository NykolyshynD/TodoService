package com.example.todoservice.crud.impl;

import com.example.todoservice.crud.Crud;
import com.example.todoservice.dao.UserFriendsDao;
import com.example.todoservice.models.UserFriends_;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserFriendsCrudImpl implements Crud<UserFriends_> {

    private UserFriendsDao userFriendsDao;

    @Override
    public void save(UserFriends_ o) {
        double firstNumbersInUserFriendsId = Math.random() * 226 * 5;
        double secondNumbersInUserFriendsId = Math.random() * 226 * 5;
        o.setId(firstNumbersInUserFriendsId + "" + o.getUserFriends().size() + "" + secondNumbersInUserFriendsId);
        userFriendsDao.save(o);
    }

    @Override
    public void delete(UserFriends_ o) {
        userFriendsDao.delete(o);
    }

    @Override
    public void update(UserFriends_ o) {
        userFriendsDao.save(o);
    }
}
