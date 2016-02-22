package com.notes.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Note {
	private String name;
	private String text;
	private Date lastUpdate;
	private Date creationDate;
	private Set<Label> labels = new HashSet<Label>();
	private long noteId;
	private User user;

	public Note() {

	}

	public Note(Date creationDate, User user) {
		this.creationDate = creationDate;
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Set<Label> getLabels() {
		return labels;
	}

	public void setLabels(Set<Label> labels) {
		this.labels = labels;
	}
	
	public void addLabel(Label label){
		this.labels.add(label);
	}

	public long getNoteId() {
		return noteId;
	}

	public void setNoteId(long noteId) {
		this.noteId = noteId;
	}

}
