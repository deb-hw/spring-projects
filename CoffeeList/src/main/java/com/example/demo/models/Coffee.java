package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// this is a db entity and instructs how to connect to db
@Entity
// 
@Table(name="coffee")
public class Coffee {
	
	@Id  // sets the private Integer as PRIMARY KEY
	// GeneratedValue AUTOmatically generates this Primary Key.
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String source;
	private Boolean tastesGood;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Boolean getTastesGood() {
		return tastesGood;
	}
	public void setTastesGood(Boolean tastesGood) {
		this.tastesGood = tastesGood;
	}

}
