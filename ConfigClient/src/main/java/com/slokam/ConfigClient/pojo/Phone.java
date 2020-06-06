package com.slokam.ConfigClient.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Phone {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String connectionType;
	private long number;
	
	@ManyToOne
	@JoinColumn(name="pid")
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
	public String getConnectionType() {
		return connectionType;
	}
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	
	

}
