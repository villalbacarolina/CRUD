package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.crud.model.Participant;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant,Long>{

}
