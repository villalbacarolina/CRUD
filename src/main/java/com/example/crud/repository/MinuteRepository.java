package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.crud.model.Minute;

@Repository
public interface MinuteRepository extends JpaRepository<Minute,Long>{

}
