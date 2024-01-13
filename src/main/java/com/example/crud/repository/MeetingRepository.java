package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.crud.model.Meeting;

@Repository
public interface MeetingRepository extends JpaRepository<Meeting,Long>{

}
