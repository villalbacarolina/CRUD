package com.example.crud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Person;
import com.example.crud.services.PersonService;

import lombok.RequiredArgsConstructor; //:(
import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    private final PersonService perServ;
    
    //because @RequiredArgsConstructor doesn't work :(
    public PersonController(PersonService perServ) {
        this.perServ = perServ;
    }

    @PostMapping("/create")
    public void create(@RequestBody Person p) {
        perServ.create(p);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Person p) {
        perServ.edit(p);
    }

    @GetMapping("/get-all")
    public List<Person> getAll() {
        return perServ.getAll();
    }

    @GetMapping("/get/{id}")
    public Person get(@PathVariable Long id) {
        return perServ.get(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        perServ.delete(id);
    }
}
