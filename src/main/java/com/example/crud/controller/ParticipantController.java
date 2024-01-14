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
import com.example.crud.services.ParticipantService;

import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/participant")
@RequiredArgsConstructor
public class ParticipantController {

	private final ParticipantService participantService;

    @PostMapping("/add")
    public void add(@RequestBody Participant p) {
        participantService.add(p);
    }

    @PutMapping("/update")
    public void update(@RequestBody Participant p) {
        participantService.update(p);
    }

    @GetMapping("/get-all")
    public List<Participant> get() {
        return participantService.get();
    }

    @GetMapping("/get/{id}")
    public Participant get(@PathVariable Long id) {
        return participantService.get(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        participantService.delete(id);
    }
}
