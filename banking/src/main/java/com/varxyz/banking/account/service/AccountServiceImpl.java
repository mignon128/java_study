package com.varxyz.banking.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.varxyz.banking.account.dao.AccountDao;
import com.varxyz.banking.account.domain.Account;


public class AccountServiceImpl{
	
	@Autowired
	AccountDao accountDao;

	public void addAccounts(Account account) {
		accountDao.addAccount(account);
	}

	
	public List<Account> getAccounts(String userId) {
		return accountDao.getAccount(userId);
	}

	
	public long getBalance(String accountNum) {
		return accountDao.getBalance(accountNum);
	}

	
	public void transfer(double money, String withdrawAccountNum, String depositAccountNum) {
		accountDao.transfer(money, withdrawAccountNum, depositAccountNum);
		
	}

	
	public void saveInterest(String accountNum, double interestRate) {
		accountDao.saveInterest(accountNum, interestRate);
	}

	
}
