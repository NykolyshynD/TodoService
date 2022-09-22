package com.example.todoservice.crud;

public interface Crud<T> {

    void save(T o);
    void delete(T o);
    void update(T o);
}
