package com.example.crud.services;

import java.util.List;

public interface ICrudService<T> {
	
    List<T> get();
    
    T get(Long id);
    
    void add(T t);
    
    void edit(T t);
    
    void delete(Long id);
}