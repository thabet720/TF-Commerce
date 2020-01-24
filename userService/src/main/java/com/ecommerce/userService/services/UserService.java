package com.ecommerce.userService.services;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.userService.entities.User;
import com.ecommerce.userService.repositories.UserRepository;


@Service(value = "userService")
public class UserService implements UserDetailsService {
	@Autowired
	private UserRepository repo;

	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;

	public void createUser(User user) {
		user.setPassword(bcryptEncoder.encode(user.getPassword()));
		System.out.println(user.toString());
		repo.save(user);
	}

	public List<User> findAllUsers() {
		List<User> users = new ArrayList<>();
		for (User user : repo.findAll()) {
			users.add(user);
		}
		return users;
	}

	public User findUserById(long id) {
		return repo.findById(id).get();
	}

	public void deleteUser(User user) {
		repo.delete(user);
	}
	public User findOne(String username) {
		return repo.findByUsername(username).get();
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.findByUsername(username).get();
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				getAuthority());
	}

	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}
}
	
