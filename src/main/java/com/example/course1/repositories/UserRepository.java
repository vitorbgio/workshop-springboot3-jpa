package com.example.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course1.entities.User;



	public interface UserRepository extends JpaRepository<User, Long>{
}
