package com.example.todoservice.crud.impl;

import com.example.todoservice.crud.Crud;
import com.example.todoservice.dao.UserTodoDao;
import com.example.todoservice.models.UserTodo_;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserTodoCrudImpl implements Crud<UserTodo_> {

    private UserTodoDao userTodoDao;

    @Override
    public void save(UserTodo_ o) {
        double firstNumbersInUserTodoId = Math.random() * 223 * 5;
        double secondNumbersInUserTodoId = Math.random() * 223 * 5;
        o.setId(firstNumbersInUserTodoId + "" + o.getUserWhoHaveTodo().getName() + "" + o.getTodoName() + "" + secondNumbersInUserTodoId);
        userTodoDao.save(o);
    }

    @Override
    public void delete(UserTodo_ o) {
        userTodoDao.delete(o);
    }

    @Override
    public void update(UserTodo_ o) {
        userTodoDao.save(o);
    }
}
