package com.varxyz.jv251.service;

import java.util.List;

import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.Customer;
import com.varxyz.jv251.exception.CustomerNotFoundException;

public class BankServiceTest {

	public static void main(String[] args) {
		BankService service = BankService.getInstance();
		String name = "동탁";
		String ssn = "800125-1234567";
		String phone = "010-4434-3232";
		String userId = "franework";
		String passwd = "1111";

		//1. 신규고객 등록
//		service.addCustomer(name, ssn, phone, userId, passwd);
		try {
//		 2. SavingAccount 생성
			service.addSavigsAccount(6000.0, 0.04, ssn);
		}catch(CustomerNotFoundException e) {
			e.printStackTrace();
		}
		//3. 고객 등록확인
		Customer customer = service.getCustomerBySsn(ssn);
		System.out.println(customer);
		
		List<Account> mylist = service.getAccountBySsn(ssn);
		for(Account account : mylist) {
			System.out.println(account);
		}
	}
}
