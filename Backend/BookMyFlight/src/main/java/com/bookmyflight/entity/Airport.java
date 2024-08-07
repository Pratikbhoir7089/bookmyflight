package com.bookmyflight.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="airports")
@SequenceGenerator(name="airport_seq",sequenceName = "airport_seq",initialValue = 3001)
public class Airport {
	@Id
	@GeneratedValue(generator ="airport_seq",strategy =GenerationType.SEQUENCE)	
	@Column(name="airport_id")
	private int aid;
	@Column(name="airport_code")
	private String airportCode;
	@Column(name="airport_name")
	private String airportName;
	@Column(name="airport_description")
	private String description;
	@Column(name="location_zip")
	private String zipcode;
	private String country;
	private String city;
	
	
	public Airport() {
		// TODO Auto-generated constructor stub
	}


	public Airport(int aid, String airportCode, String airportName, String description, String zipcode, String country,
			String city) {
		super();
		this.aid = aid;
		this.airportCode = airportCode;
		this.airportName = airportName;
		this.description = description;
		this.zipcode = zipcode;
		this.country = country;
		this.city = city;
	}


	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}


	public String getAirportCode() {
		return airportCode;
	}


	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}


	public String getAirportName() {
		return airportName;
	}


	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Airport [aid=" + aid + ", airportCode=" + airportCode + ", airportName=" + airportName
				+ ", description=" + description + ", zipcode=" + zipcode + ", country=" + country + ", city=" + city
				+ "]";
	}
	

}
