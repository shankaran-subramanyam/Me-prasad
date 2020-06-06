package com.slokam.ConfigClient.RegistrationDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.ConfigClient.pojo.LoginDetails;

@Repository
public interface RegistrationDAO extends JpaRepository<LoginDetails, Integer> {

}
