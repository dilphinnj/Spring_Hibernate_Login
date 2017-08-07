package com.dilip.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	//	@Column should be mentioned above each variable or the variable name should be same as db column name
	//can use either name in queries
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int stuId;
	
	@Column(name="stuname")
	String stuName;
	
	@Column(name="subject")
	String stuSubject;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuSub() {
		return stuSubject;
	}

	public void setStuSub(String stuPass) {
		this.stuSubject = stuPass;
	}
	
	
	
	

}
