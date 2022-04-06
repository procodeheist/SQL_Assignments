package com.raj.hiberPracticeExtra;
import javax.persistence.Embeddable;


public class MiscAddress {

	private String city;
	private String country;
	private String pincode;
	
	public MiscAddress() {
		
	}

	public MiscAddress(String city, String country, String pincode) {
		super();
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}

	
	public String getCity() {
		return city;
	}

	
	public void setCity(String city) {
		this.city = city;
	}

	
	public String getCountry() {
		return country;
	}

	
	public void setCountry(String country) {
		this.country = country;
	}

	
	public String getPincode() {
		return pincode;
	}

	
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	

}
