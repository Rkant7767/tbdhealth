package com.tech.tbdhealth.entity;

public class PhysicianDetails {
	
	private String physicianId;

	private String npi;
	
	private String firstName;
	
	private String lastName;
	
	private Address physicianAddress;
	
	private Address organizationAddress;

	public String getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(String physicianId) {
		this.physicianId = physicianId;
	}

	public String getNpi() {
		return npi;
	}

	public void setNpi(String npi) {
		this.npi = npi;
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

	public Address getPhysicianAddress() {
		return physicianAddress;
	}

	public void setPhysicianAddress(Address physicianAddress) {
		this.physicianAddress = physicianAddress;
	}

	public Address getOrganizationAddress() {
		return organizationAddress;
	}

	public void setOrganizationAddress(Address organizationAddress) {
		this.organizationAddress = organizationAddress;
	}

	@Override
	public String toString() {
		return "PhysicianDetails [physicianId=" + physicianId + ", npi=" + npi + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", physicianAddress=" + physicianAddress + ", organizationAddress="
				+ organizationAddress + "]";
	}
}
