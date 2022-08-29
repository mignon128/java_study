package com.varxyz.banking.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varxyz.banking.customer.dao.CustomerDao;
import com.varxyz.banking.customer.domain.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	public CustomerService() {
		customerDao = new CustomerDao();
	}
	
	public CustomerService(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}
	
	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);
	}
	
	public List<Customer> getAllCustomer() {
		return customerDao.findAllCustomers();	
	}
	
	public Customer getCusotmerByEmail(String email) {
		return customerDao.findCustomerByEmail(email);	
	}
	
	public Customer getCusotmerBySsn(String ssn) {
		return customerDao.findCustomerBySsn(ssn);	
	}

}
