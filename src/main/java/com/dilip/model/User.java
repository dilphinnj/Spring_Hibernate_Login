package com.dilip.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	//	@Column should be mentioned above each variable or the variable name should be same as db column name
	//can use either name in queries
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int usrId;
	
	@Column(name="usrname")
	String userName;
	
	@Column(name="password")
	String usrPass;
	
	
	public int getusrID() {
		return usrId;
	}
	public void setusrID(int usrID) {
		this.usrId = usrID;
	}
	public String getusrUserName() {
		return userName;
	}
	public void setusrUserName(String usrUserName) {
		this.userName = usrUserName;
	}
	public String getusrPassword() {
		return usrPass;
	}
	public void setusrPassword(String usrPassword) {
		this.usrPass = usrPassword;
	}
	
	

}
