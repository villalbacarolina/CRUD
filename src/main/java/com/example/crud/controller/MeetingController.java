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
import com.example.crud.services.MeetingService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/meeting")
@RequiredArgsConstructor
public class MeetingController {

    private final MeetingService meetingService;

    @PostMapping("/create")
    public void create(@RequestBody Meeting m) {
        meetingService.add(m);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Meeting m) {
        meetingService.edit(m);
    }

    @GetMapping("/get-all")
    public List<Meeting> getAll() {
        return meetingService.get();
    }

    @GetMapping("/get/{id}")
    public Meeting get(@PathVariable Long id) {
        return meetingService.get(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        meetingService.delete(id);
    }
}
