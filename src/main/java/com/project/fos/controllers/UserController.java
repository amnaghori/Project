package com.project.fos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.fos.entities.User;
import com.project.fos.services.UserService;

@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/signup")
	public String signUp(@RequestBody User user) {
		return userService.signUp(user);
	}
	
	@PostMapping("/signin")
	public String signIn() {
		return "Welcome";
	}
	
	

}
