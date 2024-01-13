package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository<T> extends JpaRepository<T,Long>{

}
