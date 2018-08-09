package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// tell spring that we will listen to requests
@RestController
public class StringController {

	private List<String> colors = new ArrayList<String>();
	
	public StringController() {
		colors.add("blue");
		colors.add("turquoise");
		colors.add("purple");
		colors.add("gold");
		colors.add("green");
		colors.add("silver");
	}
	
	// remove a color
	@DeleteMapping("/color/{index}") 
		public boolean removeColor(@PathVariable int index) {
		
		try {
			this.colors.remove(index);
			return true; 
		} catch (IndexOutOfBoundsException ex) {
			return false;
		}
	}
	
	
}
