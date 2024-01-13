package com.example.crud.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Minutes;
import com.example.crud.repository.MinutesRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MinutesService implements ICrudService<Minutes> {
    
    @Autowired 
    private MinutesRepository minutesRepository;

	@Override
	public List<Minutes> get() {
		return minutesRepository.findAll();
	}
	
	@Override
	public Minutes get(Long id) {
		return minutesRepository.findById(id).orElse(null);
	}


	@Override
	public void add(Minutes m) {
		minutesRepository.save(m);
	}


	@Override
	public void edit(Minutes m) {
		minutesRepository.save(m);
	}


	@Override
	public void delete(Long id) {
		minutesRepository.deleteById(id);
	}

}