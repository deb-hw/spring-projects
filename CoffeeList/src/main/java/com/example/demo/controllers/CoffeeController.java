package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Coffee;
import com.example.demo.models.CoffeeRepository;

@RestController
@RequestMapping("/coffee")
// @CrossOrigin says our @angular frontend is allowed to talk to this system.
@CrossOrigin(origins="http://localhost:4200")
public class CoffeeController {

	// reference to Repository
	@Autowired
	CoffeeRepository coffeeRepository;
	
	// get all coffee objects
	// ResponseEntity allows us to customize responses.
	@GetMapping()
	public ResponseEntity<List<Coffee>> getCoffee() {
		return ResponseEntity.ok(coffeeRepository.findAll());
	}
	// add a coffee object
	@PostMapping
	public ResponseEntity<Coffee> addCoffee(@RequestBody Coffee coffee) {
		coffeeRepository.save(coffee);
		// add ".build" to the end of a return when  
		// ...not adding an initial value.
		return ResponseEntity.ok(coffee);
	}
	
}

