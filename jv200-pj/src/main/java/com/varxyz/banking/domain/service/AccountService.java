package com.varxyz.banking.domain.service;

import java.util.List;

import com.varxyz.banking.domain.Account;

public interface AccountService {

	Account createSavingAccount(String accountNum, double balance, double interestRate);
	Account createCheckingAccount(String accountNum, double balance, double overdraftAmount);
	void addAccount(Account account);
	void addAccount(Account account, String ssn);
	Account getAccountByAccountNum(String accountNum);
	List<Account> getAccountBySsn(String ssn);
}
