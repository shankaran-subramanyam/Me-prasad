package com.slokam.ConfigClient;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.ConfigClient.pojo.OrderPojo;

@Service
public class OrderService {
	
	@Autowired
	private OrderDAO orderdao;
	
	@Transactional
	public void saveOrder(OrderPojo order)
	{
		orderdao.save(order);
	}
	

}
