package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.crud.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long>{

}
