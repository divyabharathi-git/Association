package com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Model.CorporateCustomer;

public interface CorpCustomerRepository extends JpaRepository<CorporateCustomer, Integer>{

}
