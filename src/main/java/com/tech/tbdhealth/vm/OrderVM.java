package com.tech.tbdhealth.vm;

import org.springframework.lang.NonNull;

import com.tech.tbdhealth.entity.PhysicianDetails;


public class OrderVM {
	
	@NonNull
	private String productCode;
	
	private String product;
	
	@NonNull
	private String firstName;
	
	@NonNull
	private String lastName;
	
	@NonNull
	private String deliveryAddress1;
	
	private String deliveryAddress2;
	
	@NonNull
	private String deliveryCity;
	
	@NonNull
	private String deliveryPostcode;
	
	private String deliveryCounty;
	
	private String deliveryState;
	
	@NonNull
	private String deliveryCountryCode;
	
	@NonNull
	private String email;
	
	@NonNull
	private String mobileCountryCode;
	
	@NonNull
	private String mobileNumber;
	
	private String notes;
	
	private PhysicianDetails physicianDetails;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDeliveryAddress1() {
		return deliveryAddress1;
	}

	public void setDeliveryAddress1(String deliveryAddress1) {
		this.deliveryAddress1 = deliveryAddress1;
	}

	public String getDeliveryAddress2() {
		return deliveryAddress2;
	}

	public void setDeliveryAddress2(String deliveryAddress2) {
		this.deliveryAddress2 = deliveryAddress2;
	}

	public String getDeliveryCity() {
		return deliveryCity;
	}

	public void setDeliveryCity(String deliveryCity) {
		this.deliveryCity = deliveryCity;
	}

	public String getDeliveryPostcode() {
		return deliveryPostcode;
	}

	public void setDeliveryPostcode(String deliveryPostcode) {
		this.deliveryPostcode = deliveryPostcode;
	}

	public String getDeliveryCounty() {
		return deliveryCounty;
	}

	public void setDeliveryCounty(String deliveryCounty) {
		this.deliveryCounty = deliveryCounty;
	}

	public String getDeliveryState() {
		return deliveryState;
	}

	public void setDeliveryState(String deliveryState) {
		this.deliveryState = deliveryState;
	}

	public String getDeliveryCountryCode() {
		return deliveryCountryCode;
	}

	public void setDeliveryCountryCode(String deliveryCountryCode) {
		this.deliveryCountryCode = deliveryCountryCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileCountryCode() {
		return mobileCountryCode;
	}

	public void setMobileCountryCode(String mobileCountryCode) {
		this.mobileCountryCode = mobileCountryCode;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public PhysicianDetails getPhysicianDetails() {
		return physicianDetails;
	}

	public void setPhysicianDetails(PhysicianDetails physicianDetails) {
		this.physicianDetails = physicianDetails;
	}

	@Override
	public String toString() {
		return "OrderVM [productCode=" + productCode + ", product=" + product + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", deliveryAddress1=" + deliveryAddress1 + ", deliveryAddress2="
				+ deliveryAddress2 + ", deliveryCity=" + deliveryCity + ", deliveryPostcode=" + deliveryPostcode
				+ ", deliveryCounty=" + deliveryCounty + ", deliveryState=" + deliveryState + ", deliveryCountryCode="
				+ deliveryCountryCode + ", email=" + email + ", mobileCountryCode=" + mobileCountryCode
				+ ", mobileNumber=" + mobileNumber + ", notes=" + notes + ", physicianDetails=" + physicianDetails
				+ "]";
	}
	
	
}
