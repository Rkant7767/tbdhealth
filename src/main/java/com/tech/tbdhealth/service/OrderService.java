package com.tech.tbdhealth.service;
import com.tech.tbdhealth.mv.OrderMV;
import com.tech.tbdhealth.vm.CustomResponse;
import com.tech.tbdhealth.vm.OrderVM;

public interface OrderService {
	
	CustomResponse addToQueue(OrderVM orderVM);

	void updateStatus(OrderMV orderMV);

}
