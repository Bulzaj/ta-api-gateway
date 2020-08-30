package com.talkactive.taapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class TaApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaApiGatewayApplication.class, args);
	}

}
