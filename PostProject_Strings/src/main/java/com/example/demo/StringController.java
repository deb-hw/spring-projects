package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// tell spring that we are going to Listen to requests
@RestController
public class StringController {

	private String sentence = "";
	
	// add a word to the sentence
	@PostMapping("/sentence/{word}")
	public String addWord(@PathVariable String word) {
		this.sentence += word + " ";
		return sentence;
	}
	
	// overwrite the whole sentence
	@PostMapping("/sentence/overwrite/{word}")
	public String overwriteWord(@PathVariable String word) {
		this.sentence = word;
		return sentence;
	}
	
	// add a word to the sentence using request body
	@PostMapping("/sentence")
	public String addWordFromBody(@RequestBody String word) {
		this.sentence += word + " ";
		return sentence;
	}
	
	// overwriting the sentence using request body
	@PostMapping("/sentence/overwrite") 
		public String overwriteWordFromBody(@RequestBody String word) {
			this.sentence = word;
			return sentence;
		}
	
	
}
