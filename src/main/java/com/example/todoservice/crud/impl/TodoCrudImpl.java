package com.example.todoservice.crud.impl;

import com.example.todoservice.crud.Crud;
import com.example.todoservice.dao.TodoEntityDao;
import com.example.todoservice.models.TodoEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TodoCrudImpl implements Crud<TodoEntity> {

    private TodoEntityDao userTodoDao;

    @Override
    public void save(TodoEntity o) {
        double firstNumbersInUserTodoId = Math.random() * 223 * 5;
        double secondNumbersInUserTodoId = Math.random() * 223 * 5;
        o.setId(firstNumbersInUserTodoId + "" + o.getUserWhoHaveTodo().getName() + "" + o.getTodoName() + "" + secondNumbersInUserTodoId);
        userTodoDao.save(o);
    }

    @Override
    public void delete(TodoEntity o) {
        userTodoDao.delete(o);
    }

    @Override
    public void update(TodoEntity o) {
        userTodoDao.save(o);
    }
}
