package com.example.authenticationByMysql.authlesson2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.authenticationByMysql.authlesson2.repo.UserRepository;

@SpringBootApplication

@EnableJpaRepositories(basePackageClasses =UserRepository.class )
public class Authlesson2Application {

	public static void main(String[] args) {
		SpringApplication.run(Authlesson2Application.class, args);
	}

}
