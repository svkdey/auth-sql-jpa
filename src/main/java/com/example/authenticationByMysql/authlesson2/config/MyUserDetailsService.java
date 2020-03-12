package com.example.authenticationByMysql.authlesson2.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.authenticationByMysql.authlesson2.model.MyUserDetails;
import com.example.authenticationByMysql.authlesson2.model.User;
import com.example.authenticationByMysql.authlesson2.repo.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findByUsername(userName);
		
		user.orElseThrow(()->new UsernameNotFoundException("user name noy found"));
		
		return user.map(MyUserDetails::new).get();
	}

}
