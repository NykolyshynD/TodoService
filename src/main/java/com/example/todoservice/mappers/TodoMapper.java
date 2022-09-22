package com.example.todoservice.mappers;

import com.example.todoservice.dto.TodoDto;
import com.example.todoservice.exception.HelpersException;
import com.example.todoservice.models.TodoEntity;

public interface TodoMapper {

    TodoEntity todoDtoToEntity(TodoDto todoDto) throws HelpersException;
    TodoDto todoEntityToDto(TodoEntity todoEntity);
}
