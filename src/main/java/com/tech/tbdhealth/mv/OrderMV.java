package com.tech.tbdhealth.mv;

public class OrderMV {

	private String productCode;
	
	private String product;
	
	private String firstName;
	
	private String lastName;
	
	private String deliveryAddress1;
	
	private String deliveryAddress2;
	
	private String deliveryCity;
	
	private String deliveryPostcode;
	
	private String deliveryCounty;
	
	private String deliveryState;
	
	private String deliveryCountryCode;
	
	private String email;
	
	private String mobileNumberAndCode;
	
	private String notes;
	
	private String status;
	
	private String createdAt;
	
	private String updatedAt;
	
	private boolean paymentConfirmed;
	
	private String orderNumber;
	
	private String dispatchedAt;
	
	private String stripeInvoiceId;

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

	public String getMobileNumberAndCode() {
		return mobileNumberAndCode;
	}

	public void setMobileNumberAndCode(String mobileNumberAndCode) {
		this.mobileNumberAndCode = mobileNumberAndCode;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	@Override
	public String toString() {
		return "OrderMV [productCode=" + productCode + ", product=" + product + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", deliveryAddress1=" + deliveryAddress1 + ", deliveryAddress2="
				+ deliveryAddress2 + ", deliveryCity=" + deliveryCity + ", deliveryPostcode=" + deliveryPostcode
				+ ", deliveryCounty=" + deliveryCounty + ", deliveryState=" + deliveryState + ", deliveryCountryCode="
				+ deliveryCountryCode + ", email=" + email + ", mobileNumberAndCode=" + mobileNumberAndCode + ", notes="
				+ notes + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", paymentConfirmed=" + paymentConfirmed + ", orderNumber=" + orderNumber + ", dispatchedAt="
				+ dispatchedAt + ", stripeInvoiceId=" + stripeInvoiceId + "]";
	}
}
