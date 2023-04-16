package com.tech.tbdhealth.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.tbdhealth.mv.OrderMV;
import com.tech.tbdhealth.service.OrderService;
import com.tech.tbdhealth.vm.CustomResponse;
import com.tech.tbdhealth.vm.OrderVM;

@RestController("/api")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/order")
	public  ResponseEntity<CustomResponse> order(@Validated @RequestBody OrderVM orderVM){
		return new ResponseEntity<CustomResponse>(orderService.addToQueue(orderVM),HttpStatus.OK);
	}
	
	
	@PostMapping("labPartner/webhook")
	public  ResponseEntity<CustomResponse> webHook(@RequestBody OrderMV orderMV){
		orderService.updateStatus(orderMV);
		return new ResponseEntity<CustomResponse>(HttpStatus.OK);
	}
	
}
