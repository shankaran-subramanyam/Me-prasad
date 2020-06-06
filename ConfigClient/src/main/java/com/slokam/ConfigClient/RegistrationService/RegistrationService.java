package com.slokam.ConfigClient.RegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slokam.ConfigClient.RegistrationDAO.RegistrationDAO;
import com.slokam.ConfigClient.pojo.LoginDetails;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationDAO regDAO;
	
	@Transactional
	public void saveLoginDatails(LoginDetails details)
	{
		regDAO.save(details);
		
	}

}
