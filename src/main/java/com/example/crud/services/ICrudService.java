package com.example.crud.services;

import java.util.List;

public interface ICrudService<T> {
	
    List<T> getAll();
    
    T get(Long id);
    
    void create(T t);
    
    void edit(T t);
    
    void delete(Long id);
}