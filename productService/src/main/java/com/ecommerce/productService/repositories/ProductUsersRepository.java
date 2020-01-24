package com.ecommerce.productService.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.ecommerce.productService.entities.Order;
@Component
public interface ProductUsersRepository extends CrudRepository<Order, Long> {

}
