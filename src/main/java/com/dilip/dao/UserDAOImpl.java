package com.dilip.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.dilip.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	
	
//	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveUser(User u) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(u);
		tx.commit();
		session.close();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> userList() {
		Session session = this.sessionFactory.openSession();		
		List<User> userList = session.createQuery("from User").list();
		session.close();
		return userList;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> getUserNameAndPassword(String username, String password) {
		Session session = this.sessionFactory.openSession();		
		List<User> user = session.createQuery("from User where usrName = '"+username+"' and usrPass = '"+password+"'").list();
		session.close();
		return user;
	}
	
	





}
