package com.example.todoservice.dao;

import com.example.todoservice.models.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoEntityDao extends JpaRepository<TodoEntity, String> {
}
