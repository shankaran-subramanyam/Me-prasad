package com.slokam.ConfigClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.ConfigClient.pojo.OrderPojo;

@RestController
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<String> saveOrder(OrderPojo order)
	{	
		service.saveOrder(order);
		ResponseEntity<String> res=new ResponseEntity<>("data Successfully inserted",HttpStatus.OK);
		return res;
		
	}

}
