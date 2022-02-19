package com.assignment.creditcards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.assignment.creditcards.entity.Carddetails;
import com.assignment.creditcards.service.CardService;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/")
public class Controller {
	
	@Autowired
	private CardService cardservice;
	
	
	
	
	@GetMapping("")
	public String home() {
		return "welcome";
		
	}
	
	@PostMapping("addcard")
	public ResponseEntity<Carddetails> addcard(@Valid @RequestBody Carddetails carddetails)
	{
		Carddetails savecard = cardservice.addcard(carddetails);
		return new ResponseEntity<Carddetails>(savecard, HttpStatus.CREATED);
		
	}
	
	 @GetMapping("cards")
	 public ResponseEntity<List<Carddetails>> getAll() {
	     return new ResponseEntity<>(cardservice.getAll(), HttpStatus.OK);
	}
	 
	 @GetMapping("card/{id}")
		public ResponseEntity<Carddetails> getById(@PathVariable String id) {
		 return new ResponseEntity (cardservice. getById(id), HttpStatus.OK);
		}

	 

}
