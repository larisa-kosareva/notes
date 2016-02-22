package com.notes.domain;

import java.util.HashSet;
import java.util.Set;

public class Label {
	private String name;
	private long labelId;
	private User user;
	private Set<Note> notes = new HashSet<Note>();

	public Label() {
	}

	public Label(String name, User user) {
		this.name = name;
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getLabelId() {
		return labelId;
	}

	public void setLabelId(long labelId) {
		this.labelId = labelId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Note> getNotes() {
		return notes;
	}

	public void setNotes(Set<Note> notes) {
		this.notes = notes;
	}

}
