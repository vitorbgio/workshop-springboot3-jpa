package com.example.course1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course1.entities.User;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value="/users")
public class UserResource {

@GetMapping
public ResponseEntity<User> findAll() {
	User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
	return ResponseEntity.ok().body(u);
	
}
}
