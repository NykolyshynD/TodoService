package com.example.todoservice.dao;

import com.example.todoservice.models.MassageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MassageEntityDao extends JpaRepository<MassageEntity, String> {
}
