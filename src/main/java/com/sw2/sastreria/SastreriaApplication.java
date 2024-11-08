package com.sw2.sastreria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SastreriaApplication {


	public static void main(String[] args) {
		SpringApplication.run(SastreriaApplication.class, args);
	}

}
