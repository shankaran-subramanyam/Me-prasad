package com.slokam.ConfigClient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.slokam.ConfigClient.pojo.OrderPojo;

@Repository
public interface OrderDAO extends JpaRepository<OrderPojo, Integer> {
	
	

}
