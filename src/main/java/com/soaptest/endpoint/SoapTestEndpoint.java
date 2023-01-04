package com.soaptest.endpoint;


import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import soap_test_schema.helloworld.HelloWorldRequest;
import soap_test_schema.helloworld.HelloWorldResponse;


@Endpoint
public class SoapTestEndpoint { 
	
	private static final String NAMESPACE_URI = "http://soap-test-schema/helloworld";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "helloWorldRequest")
	@ResponsePayload
	public HelloWorldResponse getArticle(@RequestPayload HelloWorldRequest request) {
		HelloWorldResponse response = new HelloWorldResponse();
		
		return response;
	}

}
