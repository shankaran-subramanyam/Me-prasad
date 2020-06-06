package com.slokam.ConfigClient.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity

public class LoginDetails {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String userName;
	private Integer password;
	@OneToOne(mappedBy="login")
	private PersonalDetails person;
	
	public PersonalDetails getPerson() {
		return person;
	}
	public void setPerson(PersonalDetails person) {
		this.person = person;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	
	
	

}
