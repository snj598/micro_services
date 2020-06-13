package com.eCommerce.eCommerceproducservice;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
@EnableEurekaClient
@ComponentScan("com.eCommerce.eCommerceproducservice")
@SpringBootApplication
public class ECommerceProducServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceProducServiceApplication.class, args);
	}

}
