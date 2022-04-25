package com.devsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping (value ="/users")
public class UserController {
	
	
	@Autowired
	private UserRepository repository;
	@GetMapping
	public List<User> findAll() {
		
		 List<User> result = repository.findAll();
		
		 return result;
	}
	
	
	@GetMapping(value = "/{Bi}")
	public User findById(@PathVariable Long Bi) {
		
		 User result = repository.findById(Bi).get();
		
		 return result;
	}
	
	
	@PostMapping
	public User insert(@RequestBody User user) {
		
		 User result = repository.save(user);
		
		 return result;
	}
	
	
}
