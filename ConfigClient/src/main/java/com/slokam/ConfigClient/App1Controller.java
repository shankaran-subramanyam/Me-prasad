package com.slokam.ConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App1Controller {
	
	@Value("${app1.data:defaultdata}")
	private String value;
	
	
	@RequestMapping("getdata")
	public String getData()
	{
		return value;
	}

}
