package com.example.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crud.model.Person;
import com.example.crud.repository.PersonRepository;

@Service
public class PersonService implements IService<Person> {
	
	@Autowired
	private PersonRepository persRepo;
	
	@Override
	public void create(Person t) {
        persRepo.save(t);
    }
	
	@Override
	public void edit(Person t) {
        persRepo.save(t);
    }
	
	@Override
	public List<Person> getAll(){
        return persRepo.findAll();
    }
	
	@Override
	public Person get(Long id) {
        return persRepo.findById(id).orElse(null);
	}
	
	@Override
	public void delete(Long id){
		persRepo.deleteById(id);
	}
}
