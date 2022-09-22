package com.example.todoservice.dao;

import com.example.todoservice.models.FriendsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendsEntityDao extends JpaRepository<FriendsEntity, String> {
}
