package com.ecommerce.productService.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long userId;
	private long productId;
	private int quantity;
	public Order(long userId, long productId) {
		super();
		this.userId = userId;
		this.productId = productId;
	}
	
	
}
