package com.example.crud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.crud.model.Minutes;
import com.example.crud.services.CrudService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/minutes")
@RequiredArgsConstructor
public class MinutesController {

    private final CrudService<Minutes> crudService;

    @PostMapping("/create")
    public void create(@RequestBody Minutes m) {
        crudService.create(m);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Minutes m) {
        crudService.edit(m);
    }

    @GetMapping("/get-all")
    public List<Minutes> getAll() {
        return crudService.getAll();
    }

    @GetMapping("/get/{id}")
    public Minutes get(@PathVariable Long id) {
        return crudService.get(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        crudService.delete(id);
    }
}
