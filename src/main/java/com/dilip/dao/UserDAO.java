package com.dilip.dao;

import java.util.List;

import com.dilip.model.User;

public interface UserDAO {
	
	public void saveUser(User u);	
	public List<User> userList();
	public List<User> getUserNameAndPassword(String username,String password);

}
