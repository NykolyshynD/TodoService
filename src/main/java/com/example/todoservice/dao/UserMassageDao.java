package com.example.todoservice.dao;

import com.example.todoservice.models.UserMassage_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMassageDao extends JpaRepository<UserMassage_, String> {
}
