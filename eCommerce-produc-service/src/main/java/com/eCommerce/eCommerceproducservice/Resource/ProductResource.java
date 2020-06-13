package com.eCommerce.eCommerceproducservice.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/productservice")
public class ProductResource {
	
	@Autowired
	RestTemplate template;
	@SuppressWarnings("unchecked")
	@GetMapping("/getProductName/{productName}")
	public List<String> getProductByName(@PathVariable("productName") String productName){
	return template.getForObject("http://eCommerce-db-service/db/product/"+productName,List.class);
	}

}
