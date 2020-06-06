package com.slokam.ConfigClient.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Addresss {

	
    @Id
    @GeneratedValue
	private Integer id;
	private Integer pin;
	private String street;
	private Integer doorNo;
	private String landMark;
	
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
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(Integer doorNo) {
		this.doorNo = doorNo;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	
	
}
