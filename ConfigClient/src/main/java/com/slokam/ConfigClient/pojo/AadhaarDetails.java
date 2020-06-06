package com.slokam.ConfigClient.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity

public class AadhaarDetails {
	@Id
	@GeneratedValue
	private Integer id;
	private long aadharNo;
	@OneToOne
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
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	
	
	

}
