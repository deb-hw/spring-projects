package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {

	private String[] myArray = {"apple", "mine", "sloth", "pizza", "sandwich", "pineapple"};

	// array list (added later)
	// an arraylist is a type of list
	private List<String> myArrayList = new ArrayList<String>();
	
	// there's no good way to start w/an arraylist items
	// so, use a constructor (a method w/same name as a Class):
	public ListController() {
		myArrayList.add("giraffe");
		myArrayList.add("elephant");
		myArrayList.add("dog");
		myArrayList.add("sphinx");
		myArrayList.add("wolf");
		myArrayList.add("cougar");
	}
	
	// get the whole array via @GetMapping
	@GetMapping("/array")
	public String[] getArray() {
		return this.myArray;
	}
	
	// get an item out of the array by its index
	@GetMapping("/array/{index}")
	public String getArrayItem(@PathVariable int index) {
		return this.myArray[index];
	}
	
	// get the whole list
	@GetMapping("/list")
	public List<String> getList() {
		return this.myArrayList;
	}
	
	// get an item from the arraylist
	@GetMapping("/list/{index}")
	public String getListItem(@PathVariable int index) {
		return this.myArrayList.get(index);
	}
}
