package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// step 1, tell spring that this will accept requests
@RestController
public class VariableController {

	
	// create private variables - keep names simple & straightforward.
	// String is capitalized because it is a Class
	// private means only the VariableController has access to it.
	private String myName = "Deb";
	private int myNumber = 9;
	private boolean myBoo = true;
	private double myDub = 111.11;
	// float (a # w/floating decimal) is designated by "f" at end. 
	private float myFloat = 98f;
	
	// @GetMapping, listens to an incoming GET request at the specified path
	// ("/name") is the path mapping to.
	// public (access) String (data type) getName() (METHOD name)
	// make Method names Active because they DO Something. 
	@GetMapping("/name")public String getName() {
		// THE "this. " is similar to saying ME,
		// it refers to something WITHIN this class (a container).
		return this.myName;
	}
	
	@GetMapping("/number")
	public int getNumber() {
		return this.myNumber;
	}
	
	@GetMapping("/boolean")
	public boolean getBoo() {
		return this.myBoo;
	}
	
	@GetMapping("/double")
	public double getDub() {
		return this.myDub;
	}
	
	@GetMapping("/float")
	public float getFloat() {
		return this.myFloat;
	}
	
}
