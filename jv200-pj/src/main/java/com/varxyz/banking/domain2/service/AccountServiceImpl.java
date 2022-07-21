package com.varxyz.banking.domain2.service;

import java.util.ArrayList;
import java.util.List;

import com.varxyz.banking.domain.Account;
import com.varxyz.banking.domain.CheckingAccount;
import com.varxyz.banking.domain.SavingsAccount;
import com.varxyz.banking.domain.customer.Customer;
import com.varxyz.banking.domain.customer.CustomerService;
import com.varxyz.banking.domain.customer.CustomerServiceImpl;

public class AccountServiceImpl implements AccountService {
	private static AccountService service = new AccountServiceImpl();
	private List<Account> accountList = new ArrayList<Account>(); // db역할
	private CustomerService customerService;

	private AccountServiceImpl() {
		customerService = CustomerServiceImpl.getInstance();
	}
	
	public static AccountService getInstance() {
		return service;
	}

	// Account createSavingAccount, createCheckingAccount 생성
	public Account createSavingAccount(String accountNum, double balance, double interestRate) {
		return new SavingsAccount(accountNum, balance, interestRate);
	}

	public Account createCheckingAccount(String accountNum, double balance, double overdraftAmount) {
		return new CheckingAccount(accountNum, balance, overdraftAmount);
	}
	
	/*
	 * 신규 계좌 등록
	 * @param account		계좌정보과 고객정보 전체를 캡슐화 
	 * */
	public void addAccount(Account account) {
		accountList.add(account); // account : 고객 정보가 다 찼다는 의미
	}
	
	/*
	 * 전달된 ssn을 통해 고객을 조회한 후 신규 계좌 등록
	 * @param account
	 * @param ssn
	 * */
	public void addAccount(Account account, String ssn) {
		Customer customer = customerService.getCustomerBySsn(ssn);
		account.setCustomer(customer);
	}

	public List<Account> getAccountBySsn(String ssn) {
		
		return null;
	}

	public Account getAccountByAccountNum(String accountNum) {
		for (Account c : accountList) {
			if (accountNum.equals(c.getAccountNum())) {
				return c;
			}
		}
		return null;
	}
}
