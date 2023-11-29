package com.example.crud.services;

//interface needed if it's used by more than one class
public interface IService<T> {
	
	public T get();
    
    public T get(Long id);
    
    public void add(T t);
    
    public void edit(T t);
    
    public void delete(T t);

}
