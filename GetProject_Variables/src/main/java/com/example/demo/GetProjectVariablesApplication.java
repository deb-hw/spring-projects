package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// line below helps with automatic initialization (Tomcat, etc.)
@SpringBootApplication
public class GetProjectVariablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetProjectVariablesApplication.class, args);
	}
}
