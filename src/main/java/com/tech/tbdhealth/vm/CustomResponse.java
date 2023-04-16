package com.tech.tbdhealth.vm;

public class CustomResponse {

	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public CustomResponse withData(Object data) {
		this.data = data;
		return this;
	}
	
}
