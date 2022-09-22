package com.example.todoservice.mappers.impl;

import com.example.todoservice.dao.ItemsEntityDao;
import com.example.todoservice.dto.ItemsDto;
import com.example.todoservice.exception.HelpersException;
import com.example.todoservice.mappers.ItemsMapper;
import com.example.todoservice.models.ItemsEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class ItemsMapperImpl implements ItemsMapper {

    private ItemsEntityDao itemsEntityDao;

    @Override
    public ItemsEntity ItemsTodoDtoToEntity(ItemsDto itemsDto) throws HelpersException {
        Optional<ItemsEntity> itemsEntity = itemsEntityDao.searchByItemName(itemsDto.getItemName());
        if (itemsEntity.isPresent()) {
            return itemsEntity.get();
        }
        throw new HelpersException("ItemsEntity with this item name not have");
    }

    @Override
    public ItemsDto itemsEntityToIDto(ItemsEntity itemsEntity) {
        return new ItemsDto(itemsEntity.getItemName(), itemsEntity.getItemBoost(), itemsEntity.getItemPrice());
    }
}
