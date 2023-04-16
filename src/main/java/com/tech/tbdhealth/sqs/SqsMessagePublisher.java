package com.tech.tbdhealth.sqs;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import io.github.resilience4j.retry.RetryRegistry;

public class SqsMessagePublisher <T>{

	private  String sqsQueueUrl;
	private  AmazonSQS sqsClient;
	private  ObjectMapper objectMapper;
	private  RetryRegistry retryRegistry;
	
	
	public SqsMessagePublisher(String queueName) {
	
		this.sqsClient  = AmazonSQSClientBuilder.defaultClient();
        this.sqsQueueUrl = sqsClient.getQueueUrl(queueName).getQueueUrl();
		this.objectMapper = new ObjectMapper();
		this.retryRegistry = RetryRegistry.of(RetryConfig.ofDefaults());
	}
	 
	public void publish(T message) {
		  Retry retry = retryRegistry.retry("publish");
		  retry.executeRunnable(() -> doPublish(message));
	}
	
	private void doPublish(T message) {
		  try {
		    SendMessageRequest request = new SendMessageRequest()
		    .withQueueUrl(sqsQueueUrl)
		    .withMessageBody(objectMapper.writeValueAsString(message));
		    SendMessageResult result = sqsClient.sendMessage(request);
		  
		    if (result.getSdkHttpMetadata().getHttpStatusCode() != 200) {
			    throw new RuntimeException(
			      String.format("got error response from SQS queue %s: %s",
			      sqsQueueUrl,
			      result.getSdkHttpMetadata()));
			    }
		  } catch (JsonProcessingException e) {
		    throw new IllegalStateException("error sending message to SQS: ", e);
		  }
	}
	 
}
