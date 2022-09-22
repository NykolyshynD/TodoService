package com.example.todoservice.dao;

import com.example.todoservice.models.BucketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BucketEntityDao extends JpaRepository<BucketEntity, String> {
}
