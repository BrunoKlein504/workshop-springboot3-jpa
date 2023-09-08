package com.kleinbruno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kleinbruno.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
