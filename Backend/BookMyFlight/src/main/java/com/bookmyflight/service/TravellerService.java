package com.bookmyflight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyflight.entity.Traveller;
import com.bookmyflight.repository.TravellerRepository;

@Service
public class TravellerService {
	
	@Autowired
	private TravellerRepository travellerRepo ;
	
	public List<Traveller> findallTravellers(){
		return travellerRepo.findAll();
	}
	
	public Traveller getflightbyId(int Id) {
		if(!travellerRepo.existsById(Id)) {
			throw new RuntimeException("Traveller with this Id not found"+Id);
		}
		return travellerRepo.findById(Id).get();
	}
	
	public void saveTraveller(Traveller traveller) {
		travellerRepo.save(traveller);
	}
	
	public void deleteTraveller(int Id) {
		if(!travellerRepo.existsById(Id)) {
			throw new RuntimeException("Traveller with this Id is not found"+Id);
		}
		travellerRepo.deleteById(Id);
	}
	
	public Traveller updateTraveller(int Id, Traveller traveller) {
		if(!travellerRepo.existsById(Id)) {
			throw new RuntimeException("Traveller with this Id not found"+Id);
		}
		traveller.setTravellerid(Id);
		return travellerRepo.save(traveller);
	}
}
