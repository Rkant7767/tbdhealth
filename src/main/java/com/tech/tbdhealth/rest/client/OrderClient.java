package com.tech.tbdhealth.rest.client;

import com.tech.tbdhealth.mv.OrderMV;
import com.tech.tbdhealth.vm.OrderVM;

public interface OrderClient {

	
	public OrderMV sendOrderToLabPartner(OrderVM orderVM);
}
