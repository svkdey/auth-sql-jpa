package com.example.authenticationByMysql.authlesson2.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.authenticationByMysql.authlesson2.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	 Optional<User> findByUsername(String userName);
}
