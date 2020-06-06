package com.slokam.ConfigClient.RegistrationController;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.ConfigClient.RegistrationService.RegistrationService;
import com.slokam.ConfigClient.pojo.LoginDetails;

@RestController
@RequestMapping("regis")
@CrossOrigin
public class RegistrationController {
	@Autowired
	private RegistrationService service;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<String> saveDetails(@RequestBody LoginDetails details)
	{
		service.saveLoginDatails(details);
		return new ResponseEntity<String>("successful", HttpStatus.OK);
		
	}
	

}
