package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.crud.model.Minutes;

@Repository
public interface MinutesRepository extends JpaRepository<Minutes,Long>{

}
