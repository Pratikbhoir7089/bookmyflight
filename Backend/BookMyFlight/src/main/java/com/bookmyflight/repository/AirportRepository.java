package com.bookmyflight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmyflight.entity.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {

}
