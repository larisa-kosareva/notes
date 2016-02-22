package com.notes.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.notes.domain.Note;
import com.notes.domain.Label;
import com.notes.domain.User;

public class NoteDao {

		private SessionFactory sessionFactory;
		
		
		public Note createNote(User user, Date date){
			Note note = new Note(date, user);
			Session session = sessionFactory.getCurrentSession();
			session.save(note);
			return note;
		}
		
		
		public List<Note> getNotesOfUser(User user) {
			Session session = sessionFactory.getCurrentSession();
			Criteria criteria = session.createCriteria(Note.class);
			criteria.add(Restrictions.eq("user", user));
			@SuppressWarnings("unchecked")
			List<Note> list = criteria.list();
			return list;
		}

		public SessionFactory getSessionFactory() {
			return sessionFactory;
		}

		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
		
		public void deleteNote(long noteId){
			Session session = sessionFactory.getCurrentSession();
			Note note = session.get(Note.class, noteId);
			session.delete(noteId);
		}
		
		
		public Note getNoteById(long noteId){
			Session session = sessionFactory.getCurrentSession();
			return session.get(Note.class, noteId);
		}
		
		public List<Note> getNotesByLabel(Label label) {
			Session session = sessionFactory.getCurrentSession();
			Criteria criteria = session.createCriteria(Note.class);
			criteria.add(Restrictions.eq("label", label));
			@SuppressWarnings("unchecked")
			List<Note> list = criteria.list();
			return list;
		}
		
		
	
}
