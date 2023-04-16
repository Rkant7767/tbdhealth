package com.tech.tbdhealth.rest.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.tech.tbdhealth.mv.OrderMV;
import com.tech.tbdhealth.vm.OrderVM;

@Service
public class OrderClientImpl implements OrderClient {

	Logger log = LoggerFactory.getLogger(OrderClientImpl.class);
	@Value("${orders.apikey}")
	String apiKey;
	
	@Value("${orders.baseUrl}")
	String baseUrl;
	
	@Value("${orders.api.placeorder}")
	String placeOrder;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	private static final String X_API_KEY = "x-api-key";
	
	public HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add(X_API_KEY, apiKey);
		headers.add(HttpHeaders.CONTENT_TYPE, "application/json");
		return headers;
	}
	@Override
	public OrderMV sendOrderToLabPartner(OrderVM orderVM) {
			HttpEntity<OrderVM> entity=new HttpEntity<OrderVM>(orderVM,getHeaders());
			String url = baseUrl + placeOrder;
			try {
				ResponseEntity<OrderMV> response = restTemplate.postForEntity(url, entity, OrderMV.class);
				return response.getBody();
			}
			catch(HttpClientErrorException h) {
				log.error("error occured while sending order to partners {}", h.getResponseBodyAsString());
				throw h;
			}
			catch(Exception e) {
				log.error("exception occured while sending order to partners {}", e.getMessage());
				throw e;
			}
	}

}
