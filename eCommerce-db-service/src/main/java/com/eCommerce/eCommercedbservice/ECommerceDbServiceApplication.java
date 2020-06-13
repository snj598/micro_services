package com.eCommerce.eCommercedbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableEurekaClient
@SpringBootApplication
@EnableJpaRepositories(basePackages ="com.eCommerce.eCommercedbservice.Repo")
@ComponentScan(basePackages ="com.eCommerce.eCommercedbservice")
public class ECommerceDbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceDbServiceApplication.class, args);
	}

}
