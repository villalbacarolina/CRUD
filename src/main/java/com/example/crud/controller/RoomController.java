package com.example.crud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.crud.model.Room;
import com.example.crud.services.CrudService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/room")
@RequiredArgsConstructor
public class RoomController {

    private final CrudService<Room> crudService;

    @PostMapping("/create")
    public void create(@RequestBody Room r) {
        crudService.create(r);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Room r) {
        crudService.edit(r);
    }

    @GetMapping("/get-all")
    public List<Room> getAll() {
        return crudService.getAll();
    }

    @GetMapping("/get/{id}")
    public Room get(@PathVariable Long id) {
        return crudService.get(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        crudService.delete(id);
    }
}
