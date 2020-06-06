package com.slokam.oauth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
  
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		UserDetailsImpl userDetails = new UserDetailsImpl();
		userDetails.setAccountNonExpired(true);
		userDetails.setAccountNonLocked(true);
		userDetails.setCredentialsNonExpired(true);
		userDetails.setEnabled(true);
		userDetails.setPassword("pa");
		userDetails.setUsername(arg0);
		
		Collection <GrantedAuthorityImpl> authorities 
		= new ArrayList <GrantedAuthorityImpl>();
		
		GrantedAuthorityImpl au1 =new GrantedAuthorityImpl();
		au1.setAuthority("ADMIN");
		
		authorities.add(au1);
		userDetails.setAuthorities(authorities);
		
		return userDetails;
	}
}
