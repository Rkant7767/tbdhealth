package com.tech.tbdhealth.entity;

import com.mongodb.lang.NonNull;

public class Address {

	@NonNull
	private String country;
	
	@NonNull
	private String state;
	
	@NonNull
	private String city;
	
	@NonNull
	private String zipCode;
	
	@NonNull
	private String addressLine1;
	
	private String addressLine2;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", city=" + city + ", zipCode=" + zipCode
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + "]";
	}
	
	
}
