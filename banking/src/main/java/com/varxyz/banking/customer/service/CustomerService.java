package com.varxyz.banking.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varxyz.banking.customer.dao.CustomerDao;
import com.varxyz.banking.customer.domain.Customer;

@Service
public interface CustomerService {
	
	public void addCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public Customer getCusotmerByEmail(String email);
	public Customer getCusotmerBySsn(String ssn);
}
