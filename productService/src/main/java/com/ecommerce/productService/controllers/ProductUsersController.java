package com.ecommerce.productService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.productService.entities.Order;
import com.ecommerce.productService.services.ProductUsersService;

@RestController
public class ProductUsersController {
	@Autowired
	private ProductUsersService service;
	
	@GetMapping
	public String save() {
		Order pu = new Order(1,1);
		service.save(pu);
		return "success";
	}

}
