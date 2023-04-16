package com.tech.tbdhealth.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document("order")
public class Orders {

	@Id
	private String id;
	
	@Version
	private int version;
	
	@Indexed(unique = true)
	@NonNull
	private String productCode;
	
	@Indexed(unique = true )
	@NonNull
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
	
	private String status;
	
	private String orderStatus;
	
	private String createdAt;
	
	private String updatedAt;
	
	private boolean paymentConfirmed;
	
	private String orderNumber;
	
	private String dispatchedAt;
	
	private String stripeInvoiceId;
	
	@CreatedDate
	private Date createdOn;
	
	@LastModifiedDate
	private Date updatedOn;

	
	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isPaymentConfirmed() {
		return paymentConfirmed;
	}

	public void setPaymentConfirmed(boolean paymentConfirmed) {
		this.paymentConfirmed = paymentConfirmed;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getDispatchedAt() {
		return dispatchedAt;
	}

	public void setDispatchedAt(String dispatchedAt) {
		this.dispatchedAt = dispatchedAt;
	}

	public String getStripeInvoiceId() {
		return stripeInvoiceId;
	}

	public void setStripeInvoiceId(String stripeInvoiceId) {
		this.stripeInvoiceId = stripeInvoiceId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", version=" + version + ", productCode=" + productCode + ", product=" + product
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", deliveryAddress1=" + deliveryAddress1
				+ ", deliveryAddress2=" + deliveryAddress2 + ", deliveryCity=" + deliveryCity + ", deliveryPostcode="
				+ deliveryPostcode + ", deliveryCounty=" + deliveryCounty + ", deliveryState=" + deliveryState
				+ ", deliveryCountryCode=" + deliveryCountryCode + ", email=" + email + ", mobileCountryCode="
				+ mobileCountryCode + ", mobileNumber=" + mobileNumber + ", notes=" + notes + ", physicianDetails="
				+ physicianDetails + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", paymentConfirmed=" + paymentConfirmed + ", orderNumber=" + orderNumber + ", dispatchedAt="
				+ dispatchedAt + ", stripeInvoiceId=" + stripeInvoiceId + ", createdOn=" + createdOn + ", updatedOn="
				+ updatedOn + "]";
	}

	
	
}
