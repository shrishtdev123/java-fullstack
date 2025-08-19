package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AmzonApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmzonApiGatewayApplication.class, args);
	}

}
