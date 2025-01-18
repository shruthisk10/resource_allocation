package com.estuate.resource_allocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.estuate.resource_allocation")
public class ResourceAllocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceAllocationApplication.class, args);
	}

}
