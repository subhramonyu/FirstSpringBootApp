package com.example.FirstSpringBoot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstSpringBoot.model.Location;
import com.example.FirstSpringBoot.model.User;
import com.example.FirstSpringBoot.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userservice;

	@RequestMapping(value = "/users")
	public List<User> getAllUsers() {
		return userservice.getAllUsers();
	}
	
	@RequestMapping(value= "/users/{id}")
	public User getUser(@PathVariable String id) {
		return userservice.getUser(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/users")
	public void addUser(User user) {
		userservice.addUser(user);
	}

}
