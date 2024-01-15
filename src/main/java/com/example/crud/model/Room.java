package com.example.crud.model;

import java.util.LinkedList;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter 
@NoArgsConstructor @AllArgsConstructor
public class Room{
	
	@Id
	@Column(length = 20)
	private String id;
	@Basic
	private String description;
	@Basic
	private int capacity;
	
	@OneToMany(mappedBy = "room")
    private List<Meeting> meetings;
	

	public void addMeeting(Meeting meeting) {
		if(meetings == null)
			meetings = new LinkedList<Meeting>();
		meetings.add(meeting);
	} 
	
	public boolean fullCapacity() {
		return capacity <= meetings.size();
	}

}
