package com.example.crud.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter 
@NoArgsConstructor @AllArgsConstructor
public class Room {
	
	@Id
	@Column(length = 20)
	private String id;
	@Basic
	private String description;
	@Basic
	private int capacity;

}
