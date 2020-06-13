package com.eCommerce.eCommercedbservice.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eCommerce.eCommercedbservice.model.Customers;

public interface CustomerRepo extends JpaRepository<Customers,Integer> {

	List<Customers> findByUserName(String userName);

}
