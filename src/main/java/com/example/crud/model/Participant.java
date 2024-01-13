package com.example.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter 
@NoArgsConstructor @AllArgsConstructor
@Entity 
public class Participant{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idParticipant;

	@Column(unique = true)
	private String participantNumber;

	private String name;
	private String lastName;
	
}
