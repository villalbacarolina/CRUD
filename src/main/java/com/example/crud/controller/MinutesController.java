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
import com.example.crud.services.MinutesService;

import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/minutes")
@RequiredArgsConstructor
public class MinutesController {

	private final MinutesService minutesService;

    @PostMapping("/create")
    public void create(@RequestBody Minutes m) {
        minutesService.add(m);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Minutes m) {
        minutesService.edit(m);
    }

    @GetMapping("/get-all")
    public List<Minutes> getAll() {
        return minutesService.get();
    }

    @GetMapping("/get/{id}")
    public Minutes get(@PathVariable Long id) {
        return minutesService.get(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        minutesService.delete(id);
    }
}
