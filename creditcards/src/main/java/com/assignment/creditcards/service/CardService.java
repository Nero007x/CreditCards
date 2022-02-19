package com.assignment.creditcards.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.creditcards.dao.CardRepo;
import com.assignment.creditcards.entity.Carddetails;

@Service
public class CardService {
	
	@Autowired
	private CardRepo repo;
	
	public Carddetails addcard(Carddetails carddetails)
	{
		return repo.save(carddetails);
		
	}
	
	public List<Carddetails> getAll() {
		return repo.findAll();
	}

	public Optional<Carddetails> getById(String id) {
		return repo.findById(id);
	}
}
