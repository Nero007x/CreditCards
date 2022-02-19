package com.assignment.creditcards.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.creditcards.entity.Carddetails;

public interface CardRepo extends JpaRepository<Carddetails, String>{
	
	public List<Carddetails> findByName(String name);
	

}
 