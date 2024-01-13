package com.example.crud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.crud.model.Participant;
import com.example.crud.services.CrudService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/participant")
@RequiredArgsConstructor
public class ParticipantController {

    private final CrudService<Participant> crudService;

    @PostMapping("/create")
    public void create(@RequestBody Participant p) {
        crudService.create(p);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Participant p) {
        crudService.edit(p);
    }

    @GetMapping("/get-all")
    public List<Participant> getAll() {
        return crudService.getAll();
    }

    @GetMapping("/get/{id}")
    public Participant get(@PathVariable Long id) {
        return crudService.get(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        crudService.delete(id);
    }
}
