package com.example.todoservice.dao;

import com.example.todoservice.models.User_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User_, String> {
}
