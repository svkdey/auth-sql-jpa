package com.example.authenticationByMysql.authlesson2.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	@GetMapping("/")
	public String Home() {
		return "HI from home";
	}
	@GetMapping("/user")
	public String user() {
		return "HI from user";
	}
	@GetMapping("/admin")
	public String admin() {
		return "HI from Admin";
	}
}
