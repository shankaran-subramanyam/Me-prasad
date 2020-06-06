package com.slokam.ConfigClient.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class PersonalDetails {

	@Id
	@GeneratedValue
	private Integer id;
	private String firstName;
	private String surName;
	private String lastName;
	
	@OneToMany(mappedBy="person")
	private List<Phone> phoneList;
	
	@OneToOne(mappedBy="person")
	private AadhaarDetails aadhaaar;
	
	@OneToMany(mappedBy="person")
	private List<Addresss> address;
	
	@OneToOne
	@JoinColumn(name="lid")
	private LoginDetails login;
	
	public LoginDetails getLogin() {
		return login;
	}
	public void setLogin(LoginDetails login) {
		this.login = login;
	}
	public List<Addresss> getAddress() {
		return address;
	}
	public void setAddress(List<Addresss> address) {
		this.address = address;
	}
	public AadhaarDetails getAadhaaar() {
		return aadhaaar;
	}
	public void setAadhaaar(AadhaarDetails aadhaaar) {
		this.aadhaaar = aadhaaar;
	}
	public List<Phone> getPhoneList() {
		return phoneList;
	}
	public void setPhoneList(List<Phone> phoneList) {
		this.phoneList = phoneList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}
