package com.example.todoservice.dao;

import com.example.todoservice.models.UserItems_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserItemsDao extends JpaRepository<UserItems_, String> {
}
