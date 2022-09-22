package com.example.todoservice.dao;

import com.example.todoservice.models.ItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemsEntityDao extends JpaRepository<ItemsEntity, String> {

    Optional<ItemsEntity> searchByItemName(String itemName);
}
