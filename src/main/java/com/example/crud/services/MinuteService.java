package com.example.crud.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Minute;
import com.example.crud.repository.MinuteRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MinuteService implements ICrudService<Minute> {
    
    @Autowired 
    private MinuteRepository minuteRepository;

	@Override
	public List<Minute> get() {
		return minuteRepository.findAll();
	}
	
	@Override
	public Minute get(Long id) {
		return minuteRepository.findById(id).orElse(null);
	}


	@Override
	public void add(Minute m) {
		minuteRepository.save(m);
	}


	@Override
	public void update(Minute m) {
		minuteRepository.save(m);
	}


	@Override
	public void delete(Long id) {
		minuteRepository.deleteById(id);
	}

}