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

import com.bookmyflight.entity.Flight;
import com.bookmyflight.service.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	private FlightService flightservice;
	
	@GetMapping("/flight")
	public List<Flight> findAllFlight(){
		return flightservice.findAllFlights();
	}
	
	@GetMapping("/flight/{Id}")
	public Flight getFlight(@PathVariable int Id) {
		return flightservice.getflightbyID(Id);
	}
	
	@PostMapping("/flight")
	public void createFlight(@RequestBody Flight flight) {
		flightservice.saveflight(flight);
	}
	
	@DeleteMapping("/flight/{Id}")
	public void deleteflight(@PathVariable int Id) {
		flightservice.deleteflight(Id);
	}
	@PutMapping("/flight/{Id}")
	public Flight updateflight(@PathVariable int Id,@RequestBody Flight flight) {
		return flightservice.updateflight(Id, flight);
	}
	
}
