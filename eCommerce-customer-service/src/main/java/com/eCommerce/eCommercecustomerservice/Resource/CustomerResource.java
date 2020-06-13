package com.eCommerce.eCommercecustomerservice.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/customerservice")
public class CustomerResource {
	
	@Autowired
	private RestTemplate template;
	@SuppressWarnings("unchecked")
	@GetMapping("/getCustomer/{userName}")
	public List<String> getCustomerByUserName(@PathVariable("userName") String userName)
	{
		return template.getForObject("http://eCommerce-db-service/db/customer/"+userName,List.class);
	}
	

}
