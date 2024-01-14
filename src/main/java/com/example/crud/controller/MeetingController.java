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
import com.example.crud.model.Participant;
import com.example.crud.services.MeetingService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/meeting")
@RequiredArgsConstructor
public class MeetingController {

    private final MeetingService meetingService;

    @PostMapping("/add")
    public void add(@RequestBody Meeting m) {
        meetingService.add(m);
    }

    @PutMapping("/update")
    public void update(@RequestBody Meeting m) {
        meetingService.update(m);
    }

    @GetMapping("s")
    public List<Meeting> get() {
        return meetingService.get();
    }

    @GetMapping("/{id}")
    public Meeting get(@PathVariable Long id) {
        return meetingService.get(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        meetingService.delete(id);
    }
    
    @PostMapping("/add-participant-to-meeting/{idMeeting}/")
    public void addParticipantToMeeting(@PathVariable Long idMeeting, @RequestBody Long idParticipant) {
        meetingService.addParticipantsToMeeting(idMeeting, idParticipant);
    }
    
    
}
