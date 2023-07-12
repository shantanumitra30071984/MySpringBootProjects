package com.spring.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
public class UsersController {
	@GetMapping("/status")
	public String getStatus() {
		return "Working";
	}

}
