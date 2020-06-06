package com.slokam.oauth;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

public class WebSecConfiguration  extends WebSecurityConfigurerAdapter{

	/*@Override
	@Bean
	public  UserDetailsService userDetailsService(){
		return new UserDetailsServiceImpl();
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService());
	}*/
	
	

}
