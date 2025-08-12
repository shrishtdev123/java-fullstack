package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AmzonServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmzonServiceRegistryApplication.class, args);
	}

}
