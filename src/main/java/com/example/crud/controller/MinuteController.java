package com.example.crud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.crud.model.Minute;
import com.example.crud.services.MinuteService;

import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/minutes")
@RequiredArgsConstructor
public class MinuteController {

	private final MinuteService minuteService;

    @PostMapping("/add")
    public void add(@RequestBody Minute m) {
        minuteService.add(m);
    }

    @PutMapping("/update")
    public void update(@RequestBody Minute m) {
        minuteService.update(m);
    }

    @GetMapping("/get-all")
    public List<Minute> get() {
        return minuteService.get();
    }

    @GetMapping("/get/{id}")
    public Minute get(@PathVariable Long id) {
        return minuteService.get(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        minuteService.delete(id);
    }
}
