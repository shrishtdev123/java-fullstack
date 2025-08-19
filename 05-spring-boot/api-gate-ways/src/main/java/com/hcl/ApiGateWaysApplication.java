package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGateWaysApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateWaysApplication.class, args);
	}

}
