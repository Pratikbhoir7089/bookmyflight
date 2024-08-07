package com.bookmyflight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyflight.entity.Traveller;
import com.bookmyflight.service.TravellerService;

@RestController
public class TravellerController {
	
	@Autowired
	private TravellerService travellerservice;
	
	@GetMapping("/traveller")
	public List<Traveller> findallTraveller(){
		return travellerservice.findallTravellers();
	}
	
	@GetMapping("/traveller/{Id}")
	public Traveller getTraveller(@PathVariable int Id) {
		return travellerservice.getflightbyId(Id);
	}
	
	@PostMapping("/traveller")
	public void createTraveller(@RequestBody Traveller traveller) {
		travellerservice.saveTraveller(traveller);
	}
	
	@DeleteMapping("/traveller/{Id}")
	public void deleteTraveller(@PathVariable int Id) {
		 travellerservice.deleteTraveller(Id);
	}
	
	@PutMapping("/traveller/{Id}")
	public Traveller updateTraveller(@PathVariable int Id, @RequestBody Traveller traveller) {
		return travellerservice.updateTraveller(Id, traveller);
	}
	
}
