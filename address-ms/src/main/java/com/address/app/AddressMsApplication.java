package com.address.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AddressMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressMsApplication.class, args);
	}

}
