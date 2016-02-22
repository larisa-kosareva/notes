package com.notes.spring;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.Transactional;

import com.notes.dao.LabelDao;
import com.notes.dao.UserDao;
import com.notes.dao.NoteDao;
import com.notes.domain.Label;
import com.notes.domain.Note;
import com.notes.domain.User;

public class Main {

	private NoteDao noteDao;
	private UserDao userDao;
	private LabelDao labelDao;

	@Transactional
	public void dupa() {
		User user = userDao.createUser("user", "password");
		Label label = labelDao.createLabel(user, "gopa");
		Label label1 = labelDao.createLabel(user, "butt");
		Note note = noteDao.createNote(user, new Date());
		note.addLabel(label);
		note.addLabel(label1);
		note.setText("butt arsch ass dupa gopa");
	}

	public NoteDao getNoteDao() {
		return noteDao;
	}

	public void setNoteDao(NoteDao noteDao) {
		this.noteDao = noteDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public LabelDao getLabelDao() {
		return labelDao;
	}

	public void setLabelDao(LabelDao labelDao) {
		this.labelDao = labelDao;
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Main main = context.getBean("main", Main.class);
		main.dupa();
	}

}