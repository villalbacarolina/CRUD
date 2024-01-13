package com.example.crud.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crud.repository.Repository;

@Service
public class CrudService<T> implements ICrudService<T> {
	
	@Autowired
	private Repository<T> repository;
	
	@Override
	public void create(T t) {
        repository.save(t);
    }
	
	@Override
	public void edit(T t) {
        repository.save(t);
    }
	
	@Override
	public List<T> getAll(){
        return repository.findAll();
    }
	
	@Override
	public T get(Long id) {
        return repository.findById(id).orElse(null);
	}
	
	@Override
	public void delete(Long id){
		repository.deleteById(id);
	}
}
