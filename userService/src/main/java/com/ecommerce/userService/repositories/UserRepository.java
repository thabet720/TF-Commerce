package com.ecommerce.userService.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.userService.entities.User;



public interface UserRepository extends CrudRepository<User, Long> {
	public Optional<User> findByUsername(String username);
}
