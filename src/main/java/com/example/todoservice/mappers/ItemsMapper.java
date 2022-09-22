package com.example.todoservice.mappers;

import com.example.todoservice.dto.ItemsDto;
import com.example.todoservice.exception.HelpersException;
import com.example.todoservice.models.ItemsEntity;

public interface ItemsMapper {

    ItemsEntity ItemsTodoDtoToEntity(ItemsDto itemsDto) throws HelpersException;
    ItemsDto itemsEntityToIDto(ItemsEntity itemsEntity);
}
