package com.varxyz.jv250.banking;

import java.util.List;

public class CustomerDaoTest {
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();

		// findAllCustomers() Test
		List<Customer> customerList = dao.findAllCustomers();
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
		System.out.println("-------------------------");

//		Customer customer = dao.findCustomerBySsn("901213-1234567");
//		System.out.println(customer);
//		System.out.println("-------------------------");

		Customer c = new Customer();
		c.setCid(1004);
		c.setName("공명");
		c.setSsn("940824-1234567");
		c.setPhone("010-4567-1234");
		c.setCustomerId("css");
		c.setPasswd("1234");
		System.out.println(c);

//		dao.addCustomer(c);
	}
}
