package com.kleinbruno.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kleinbruno.course.entities.Order;
import com.kleinbruno.course.repositories.OrderRepository;

@Service //@Component
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		 Optional<Order>  obj = repository.findById(id);
		 return obj.get();
	}
}
