package com.ecommerce.authentificationService.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.authentificationService.entities.User;


public interface UserRepository extends CrudRepository<User, Integer> {
	public Optional<User> findByUsername(String username);
}
