package com.example.todoservice.dao;

import com.example.todoservice.models.UserFriends_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFriendsDao extends JpaRepository<UserFriends_, String> {
}
