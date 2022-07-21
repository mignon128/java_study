package com.varxyz.jv251.dao;

import java.util.List;

import com.varxyz.jv251.domain.Customer;

public class CustomerDaoTest {
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();

		// findAllCustomers() Test
		List<Customer> customerList = dao.findAllCustomers();
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
		System.out.println("-------------------------");

		Customer c = new Customer();
		c.setCid(1004);
		c.setName("공명");
		c.setSsn("940824-1234567");
		c.setPhone("010-4567-1234");
		c.setUserId("css");
		c.setPasswd("1234");
		System.out.println(c);
//		dao.addCustomer(c);
	}
}
