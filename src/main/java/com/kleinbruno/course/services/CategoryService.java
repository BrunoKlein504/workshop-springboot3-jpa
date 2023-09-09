package com.kleinbruno.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kleinbruno.course.entities.Category;
import com.kleinbruno.course.repositories.CategoryRepository;

@Service //@Component
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		 Optional<Category>  obj = repository.findById(id);
		 return obj.get();
	}
}
