package com.example.demo.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 
@Repository 
// (type @Repository above, then update interface below 
// with EXTENDS before trying to Import @Repository). 
public interface CoffeeRepository extends JpaRepository<Coffee, Integer>{

}
