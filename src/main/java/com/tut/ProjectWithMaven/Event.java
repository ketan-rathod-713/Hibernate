package com.tut.ProjectWithMaven;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Event {
	@Id
	private String eventId;
	private String eventName;
	private String eventDescription;
	private String userId;
	
	
	public Event(String eventId,String eventName, String eventDescription, String userId) {
		super();
		this.eventName = eventName;
		this.eventDescription = eventDescription;
		this.userId = userId;
		this.eventId = eventId;
	}
	

	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
	public String getEventId() {
		return eventId;
	}


	public void setEventId(String eventId) {
		this.eventId = eventId;
	}


	@Override
	public String toString() {
		return "Event [eventName=" + eventName + ", eventDescription=" + eventDescription + ", userId=" + userId + "]";
	}
	
}

