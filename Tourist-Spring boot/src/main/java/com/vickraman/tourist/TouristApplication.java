package com.vickraman.tourist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@SpringBootApplication

public class TouristApplication {
	@LoadBalanced
	public static void main(String[] args) {
		SpringApplication.run(TouristApplication.class, args);
	}

}
