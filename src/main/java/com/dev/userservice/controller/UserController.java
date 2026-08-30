package com.dev.userservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.userservice.Entity.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/user")
public class UserController 
{
	
	@PostMapping("/verifyLogin")
	public String verifyLogin(@RequestBody User user) 
	{
		return "verify login";
	}
	
	
	
	

}
