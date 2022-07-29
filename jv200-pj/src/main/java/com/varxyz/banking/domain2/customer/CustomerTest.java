package com.varxyz.banking.domain2.customer;

import com.varxyz.banking.domain.service.AccountService;
import com.varxyz.banking.domain.service.AccountServiceImpl;
import com.varxyz.banking.domain.Account;

public class CustomerTest {
	public static void main(String[] args) {
		CustomerService customerService = CustomerServiceImpl.getInstance();
		customerService.addCustomer(new Customer("홍길동", "12345-67890", "010-1111-2222", "abc", "abcd1"));
		customerService.addCustomer(new Customer("박길동", "67890-12345", "010-3333-4444", "def", "defg2"));

		customerService.getCustomerBySsn("1234-5678");
		for (Customer c : customerService.getAllCustomers()) {
			System.out.println(c.getName());
			System.out.println(c.getPhone());
		}
		System.out.println(customerService.getNumOfCustomers());
		System.out.println(customerService.getCustomerBySsn("12345-67890"));
		System.out.println(customerService.getAllCustomers());
		AccountService as = AccountServiceImpl.getInstance();
		Account a1 = as.createCheckingAccount("111", 10000, 5000);
		System.out.println(a1.getAccountNum());
		System.out.println(a1.getBalance());
	}
}
