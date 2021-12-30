package com.example.codejava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
 private UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String ID) throws UsernameNotFoundException {
		user user = repo.findByID(ID);
		if(user==null) {
			throw new UsernameNotFoundException("ID not found");
		}
		return new CustomUserDetails(user);
	}

}
