package com.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Model.CorporateCustomer;
import com.demo.Repository.CorpCustomerRepository;

@RestController
@RequestMapping("/corporate") 
public class CorpCustomerContoller {
	
	CorpCustomerRepository repository;
	
	@GetMapping("/allCustomers")  
	private CorporateCustomer getAllCorporateCustomers() {
		
		repository.findAll();
		return null;
		
	}

}
