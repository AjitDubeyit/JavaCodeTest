package com.example.springsecurityjpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springsecurityjpa.model.User;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException{
		//return new MyUserDetails(s);
		Optional<User> user = userRepository.findByUserName(s);
		user.orElseThrow(()-> new UsernameNotFoundException("Not found: " +s));
		return user.map(MyUserDetails::new).get();
	}
}
