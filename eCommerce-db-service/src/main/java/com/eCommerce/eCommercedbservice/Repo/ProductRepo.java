package com.eCommerce.eCommercedbservice.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eCommerce.eCommercedbservice.model.Customers;
import com.eCommerce.eCommercedbservice.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

	

	List<Product> findByName(String productName);

}
 