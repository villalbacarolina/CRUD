package com.example.crud.services;

import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

import com.example.crud.model.Person;
import com.example.crud.repository.PersonRepository;

@Service //implements IService
public class PersonService implements IService{
	
	private PersonRepository persRepo;
	
	@Override
	public void create(Object t) {
        if (t instanceof Person) 
        	persRepo.save((Person) t);
        else
        	throw new IllegalArgumentException("ERROR: invalid type");
    }
	
	@Override
	public void edit(Object t) {
        if (t instanceof Person) 
        	persRepo.save((Person) t);
        else
        	throw new IllegalArgumentException("ERROR: invalid type");
    }
	
	@Override
	public List getAll(){
        List persons = (List) persRepo.findAll();
        return persons;
    }
	
	@Override
	public Object get(Long id) {
		Person p= persRepo.findById(id).orElse(null);
        return p;
	}
	
	@Override
	public void delete(Long id){
		persRepo.deleteById(id);
	}

}
