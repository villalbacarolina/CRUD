package com.example.crud.model;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity 
public class Participant{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(unique = true)
	private String participantNumber;

	private String name;
	private String lastName;
	
	@ManyToMany
	private Set<Meeting> meetings;
	
	//________________________CONSTRUCTORS________________________//
	
	
	public Participant() {
		meetings = new HashSet<Meeting>();
	}
	
	public Participant(String participantNumber, String name, String lastName) {
		this();
		this.participantNumber = participantNumber;
		this.name = name;
		this.lastName = lastName;
	}
	
	
	//__________________________METHODS___________________________//
	
	
	public void addMeeting(Meeting meeting) {
		meetings.add(meeting);
		if (!meeting.getParticipants().contains(this))
			meeting.addParticipant(this);
	}
	
	public void deleteMeeting(Meeting m){
		meetings.remove(m);
	}
}
