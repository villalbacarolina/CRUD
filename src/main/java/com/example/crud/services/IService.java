package com.example.crud.services;

import org.hibernate.mapping.List;

//interface needed if it's used by more than one class
public interface IService<T> {
	
	List getAll();
    
    T get(Long id);
    
    void create(T t);
    
    void edit(T t);
    
    void delete(Long id);

}
