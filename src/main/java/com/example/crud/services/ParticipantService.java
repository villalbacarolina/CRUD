package com.example.crud.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crud.model.Participant;
import com.example.crud.repository.ParticipantRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ParticipantService implements ICrudService<Participant> {
    
    @Autowired 
    private ParticipantRepository participantRepository;

	@Override
	public List<Participant> get() {
		return participantRepository.findAll();
	}
	
	@Override
	public Participant get(Long id) {
		return participantRepository.findById(id).orElse(null);
	}


	@Override
	public void add(Participant p) {
		participantRepository.save(p);
	}


	@Override
	public void update(Participant p) {
		participantRepository.save(p);
	}


	@Override
	public void delete(Long id) {
		participantRepository.deleteById(id);
	}
	
}
