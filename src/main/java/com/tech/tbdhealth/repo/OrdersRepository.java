package com.tech.tbdhealth.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tech.tbdhealth.entity.Orders;

public interface OrdersRepository extends MongoRepository<Orders,String>{

	public Orders findByOrderNumber(String orderNumber);
}
