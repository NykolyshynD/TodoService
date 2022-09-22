package com.example.todoservice.mappers.impl;

import com.example.todoservice.dao.TodoEntityDao;
import com.example.todoservice.dto.TodoDto;
import com.example.todoservice.exception.HelpersException;
import com.example.todoservice.mappers.TodoMapper;
import com.example.todoservice.models.TodoEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class TodoMapperImpl implements TodoMapper {

    private TodoEntityDao todoEntityDao;

    @Override
    public TodoEntity todoDtoToEntity(TodoDto todoDto) throws HelpersException {
        Optional<TodoEntity> todoEntity = todoEntityDao.searchByTodoName(todoDto.getTodoName());
        if (todoEntity.isPresent()) {
            return todoEntity.get();
        }
        throw new HelpersException("todoEntity with this todo name not have");
    }

    @Override
    public TodoDto todoEntityToDto(TodoEntity todoEntity) {
        return new TodoDto(todoEntity.getTodoName(), todoEntity.getDescription(), todoEntity.getLiveTime());
    }
}
