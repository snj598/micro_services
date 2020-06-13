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

import com.eCommerce.eCommercedbservice.Repo.CustomerRepo;
import com.eCommerce.eCommercedbservice.model.Customers;

@RestController
@RequestMapping("/db/customer")
public class CustomerResource {
	
	@Autowired
   CustomerRepo customerRepo;
	
	
	
	@GetMapping("{userName}")
	public List<String> getCustomerByUserName(@PathVariable("userName") String userName)
	{
		List<Customers> customerList=customerRepo.findByUserName(userName);
		List<String> customerName=new ArrayList<String>();
		for(Customers customer:customerList)
		{
			customerName.add(customer.getName());
		}
		return customerName;
	}
	@PostMapping("/save")
	public void save(@RequestBody Customers customer)
	{
		customerRepo.save(customer);
	}


}
