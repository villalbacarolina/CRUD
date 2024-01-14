package com.example.crud.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity 
public class Meeting {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private LocalDateTime date;
	private String subject;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Room room;
	
	@OneToOne(mappedBy="meeting")
	private Minute minute;
	
	@ManyToMany(mappedBy="meetings")
	private Set<Participant> participants;
	
	
	//________________________CONSTRUCTORS________________________//
	
	public Meeting(){
		participants= new HashSet<Participant>();
	}
	
	public Meeting(LocalDateTime date, String subject) {
		this();
		this.date = date;
		this.subject = subject;
		this.minute = new Minute();
		minute.setMeeting(this);
	}
	
	//__________________________METHODS___________________________//
	

	//_ _ _ _ _ _ _ _ _ _ _ _ PARTICIPANTS _ _ _ _ _ _ _ _ _ _ _ _//
	
	
	public void addParticipant(Participant participant) {
		participants.add(participant);
		if (!participant.getMeetings().contains(this))
			participant.addMeeting(this);
	}
	
	public void deleteParticipant(Participant p) {
		participants.remove(p);
	}
	
	//_ _ _ _ _ _ _ _ _ _ _ _ _ MINUTES _ _ _ _ _ _ _ _ _ _ _ _ _ //
	
	public void writeMinute(String content) {
		minute.setContent(content);
	}
	//_ _ _ _ _ _ _ _ _ _ _ _ _ _ ROOM _ _ _ _ _ _ _ _ _ _ _ _ _ _//
	
	public void setRoom(Room r) {
		this.room=r;
		r.addMeeting(this);
	}

}
