package com.example.crud.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crud.model.Meeting;
import com.example.crud.repository.MeetingRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class MeetingService implements ICrudService<Meeting> {
    
    @Autowired 
    private MeetingRepository meetingRepository;

    
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
	public void edit(Meeting m) {
		meetingRepository.save(m);
	}

	@Override
	public void delete(Long id) {
		meetingRepository.deleteById(id);
	}

}
