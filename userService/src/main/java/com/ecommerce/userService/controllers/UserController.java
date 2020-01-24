package com.ecommerce.userService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.userService.entities.User;
import com.ecommerce.userService.services.UserService;


@CrossOrigin
@RestController
public class UserController {
	@Autowired
	private UserService service;
	

	@GetMapping
	public List<User> getAllUsers (){
	
		return service.findAllUsers();
	
	}
	
	@PostMapping
	public String createUser(@RequestBody User user) {
		System.out.println(user.toString());
		service.createUser(user);
		return "success";
	}

	@GetMapping("/{id}")
	public User getById(@PathVariable int id) {
		
		return service.findUserById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable long id) {
		service.deleteUser(service.findUserById(id));
	
		return "success";
	}

}
