package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.model.Person;

//entity, type of the id
public interface PersonRepository extends JpaRepository<Person,Long>{

}
