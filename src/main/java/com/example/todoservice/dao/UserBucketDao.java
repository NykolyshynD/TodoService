package com.example.todoservice.dao;

import com.example.todoservice.models.UserBucket_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBucketDao extends JpaRepository<UserBucket_, String> {
}
