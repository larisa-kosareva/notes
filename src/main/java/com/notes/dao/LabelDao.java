package com.notes.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.notes.domain.Label;
import com.notes.domain.User;

public class LabelDao {
	private SessionFactory sessionFactory;
	
	
	public Label createLabel(User user, String name){
		Label label = new Label(name, user);
		Session session = sessionFactory.getCurrentSession();
		session.save(label);
		return label;
	}
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void updateLabel(Label label){
		Session session = sessionFactory.getCurrentSession();
		session.update(label);
	}
	
	
	
}
