package com.example.crud.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crud.model.Meeting;
import com.example.crud.model.Participant;
import com.example.crud.repository.MeetingRepository;
import com.example.crud.repository.ParticipantRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MeetingService implements ICrudService<Meeting> {
    
    @Autowired 
    private MeetingRepository meetingRepository;
    
    @Autowired
    private ParticipantRepository participantRepository;

    
	@Override
	public List<Meeting> get() {
		return meetingRepository.findAll();
	}
	
	@Override
	public Meeting get(Long id) {
		return meetingRepository.findById(id).orElse(null);
	}

	@Override
	public void add(Meeting m) {
		meetingRepository.save(m);
	}

	@Override
	public void update(Meeting m) {
		meetingRepository.save(m);
	}

	@Override
	public void delete(Long id) {
		meetingRepository.deleteById(id);
	}

	//add security
	 public void addParticipantsToMeeting(Long idMeeting, Long idParticipant) {
	        Meeting meeting = meetingRepository.findById(idMeeting).orElse(null);
	        Participant participant = participantRepository.findById(idParticipant).orElse(null);

	        if (meeting!=null || participant!=null)
	        {
	            meeting.getParticipants().add(participant); //add participant to the set participants from the meeting
	            meetingRepository.save(meeting); //update the meeting
	        }
	        else 
	            throw new IllegalArgumentException("ERROR: Invalid arguments.");
	 }

}
