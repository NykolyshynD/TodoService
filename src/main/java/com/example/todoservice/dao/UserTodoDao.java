package com.example.todoservice.dao;

import com.example.todoservice.models.UserTodo_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTodoDao extends JpaRepository<UserTodo_, String> {
}
