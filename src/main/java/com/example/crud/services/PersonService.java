//package com.example.crud.services;
//
//import org.hibernate.mapping.List;
//import org.springframework.stereotype.Service;
//
//import com.example.crud.model.Person;
//import com.example.crud.repository.PersonRepository;
//
//@Service
//public class PersonService implements IService{
//	
//	private PersonRepository pR;
//
//	@Override
//	public Object get() {
//		List<Person> persons = pR.findAll();  //JPA method, from extends
//        return (Object) persons;
//	}
//
//	@Override
//	public Object get(Long id) {
//		Person p= pR.findById(id).orElse(null);
//        return p;
//	}
//
//	@Override
//	public void add(Object t) {
//		pR.save(t); 
//	}
//
//	@Override
//	public void edit(Object t) {
//		pR.save(t); 
//	}
//
//	@Override
//	public void delete(Object t) {
//		pR.deleteById(t);
//	}
//
//}
