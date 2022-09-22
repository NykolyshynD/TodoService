package com.example.todoservice.dao;

import com.example.todoservice.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserEntityDao extends JpaRepository<UserEntity, String> {

    Optional<UserEntity> searchByName(String name);
}
