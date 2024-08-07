package com.bookmyflight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyflight.entity.Booking;
import com.bookmyflight.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingservice;
	
	@GetMapping("/booking")
	public List<Booking> findAllBooking(){
		return bookingservice.findAllBooking();
	}
	
	@GetMapping("/booking/{Id}")
	public Booking getBooking(@PathVariable int Id) {
		return bookingservice.getbookingid(Id);
	}
	
	@PostMapping("/booking")
	public void createBooking(@RequestBody Booking booking) {
		bookingservice.saveBooking(booking);
	}
	
	@DeleteMapping("/booking/{Id}")
	public void deleteBooking(@PathVariable int Id) {
		bookingservice.deletebooking(Id);
	}
	
	public Booking updatebooking(@PathVariable int Id,@RequestBody Booking booking) {
		return bookingservice.updatebooking(Id, booking);
	}
	
}
