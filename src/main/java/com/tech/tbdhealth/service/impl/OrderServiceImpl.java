package com.tech.tbdhealth.service.impl;


import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

import com.tech.tbdhealth.entity.Orders;
import com.tech.tbdhealth.mv.OrderMV;
import com.tech.tbdhealth.repo.OrdersRepository;
import com.tech.tbdhealth.rest.client.OrderClient;
import com.tech.tbdhealth.service.OrderService;
import com.tech.tbdhealth.sqs.SqsMessagePublisher;
import com.tech.tbdhealth.vm.CustomResponse;
import com.tech.tbdhealth.vm.OrderVM;

@Service
public class OrderServiceImpl implements OrderService{

	Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private OrdersRepository ordersRepository;
	
	@Autowired
	private OrderClient orderClient;
	
	@Autowired
	private static final String queueName = "inboud_order";
	@Override
	public CustomResponse addToQueue(OrderVM orderVM) {
		try {
			SqsMessagePublisher<OrderVM> publisher = new SqsMessagePublisher<OrderVM>(queueName);
			publisher.publish(orderVM);
			return new CustomResponse().withData(Boolean.TRUE);
		}
		catch(Exception j) {
			log.error("Exception occured while parsing order {}" , j.getMessage(),j);
		}
		return new CustomResponse().withData(Boolean.FALSE);
	}

	
	@SqsListener(value = "outbound_order_fulfill", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
	  public void receiveMessage(final OrderVM message, 
	    @Header("SenderId") String senderId) {
		log.info("message received {} {}",senderId,message);
		Orders orders = modelMapper.map(message, Orders.class);
		orders.setStatus("PENDING_FULFILL");
		ordersRepository.save(orders);
		OrderMV orderMV = orderClient.sendOrderToLabPartner(message);
		orders.setCreatedAt(orderMV.getCreatedAt());
		orders.setOrderNumber(orderMV.getOrderNumber());
		orders.setStripeInvoiceId(orderMV.getStripeInvoiceId());
		orders.setStatus("SENT_TO_LAB");
		ordersRepository.save(orders);
		log.info("message sent successfully {}",senderId);
	  }


	@Override
	public void updateStatus(OrderMV orderMV) {
		
		Orders order = ordersRepository.findByOrderNumber(orderMV.getOrderNumber());
		order.setOrderStatus(orderMV.getStatus());
		order.setCreatedAt(orderMV.getCreatedAt());
		order.setUpdatedAt(orderMV.getUpdatedAt());
		ordersRepository.save(order);
		
	}
}
