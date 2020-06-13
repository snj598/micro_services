package com.eCommerce.eCommercedbservice.Resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.eCommercedbservice.Repo.ProductRepo;
import com.eCommerce.eCommercedbservice.model.Product;

@RestController
@RequestMapping("/db/product")
public class ProductResource {
	
	@Autowired
	ProductRepo productRepo;
	
	@GetMapping("/getAllProduct")
	public List<Product> getProduct()
	{
		return productRepo.findAll();
	}
	
	@GetMapping("{productName}")
	public List<String> getProductPrice(@PathVariable("productName") String productName)
	{
		List<Product> productList=productRepo.findByName(productName);
		List<String> prices=new ArrayList<String>();
		for(Product product:productList)
		{
			prices.add(product.getPrice());
		}
		return prices;
	}
	@PostMapping("/save")
	public void save(@RequestBody Product product)
	{
		productRepo.save(product);
	}

}
