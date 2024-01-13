package com.example.crud.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Room;
import com.example.crud.repository.RoomRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RoomService implements ICrudService<Room> {
    
    @Autowired 
    private RoomRepository roomRepository;

	@Override
	public List<Room> get() {
		return roomRepository.findAll();
	}
	
	@Override
	public Room get(Long id) {
		return roomRepository.findById(id).orElse(null);
	}


	@Override
	public void add(Room r) {
		roomRepository.save(r);
	}


	@Override
	public void edit(Room r) {
		roomRepository.save(r);
	}


	@Override
	public void delete(Long id) {
		roomRepository.deleteById(id);
	}
}
