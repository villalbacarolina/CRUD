package com.example.crud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.crud.model.Meeting;
import com.example.crud.services.CrudService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/meeting")
@RequiredArgsConstructor
public class MeetingController {

    private final CrudService<Meeting> crudService;

    @PostMapping("/create")
    public void create(@RequestBody Meeting m) {
        crudService.create(m);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Meeting m) {
        crudService.edit(m);
    }

    @GetMapping("/get-all")
    public List<Meeting> getAll() {
        return crudService.getAll();
    }

    @GetMapping("/get/{id}")
    public Meeting get(@PathVariable Long id) {
        return crudService.get(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        crudService.delete(id);
    }
}
