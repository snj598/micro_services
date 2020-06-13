package com.eCommerce.eCommercecustomerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@EnableEurekaClient
@ComponentScan("com.eCommerce.eCommercecustomerservice")
@SpringBootApplication
public class ECommerceCustomerServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ECommerceCustomerServiceApplication.class, args);
}
}