package com.ecommerce.productService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.productService.entities.Order;
import com.ecommerce.productService.repositories.ProductUsersRepository;

@Service
public class ProductUsersService {
	@Autowired
	private ProductUsersRepository repo;
	
	public void save(Order productUsers) {
		repo.save(productUsers);
	}

}
