package com.varxyz.banking.account.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.varxyz.banking.account.domain.Account;

@Service
public interface AccountService {
	
	void addAccount(Account account);
	List<Account> getAccountByAccountNum(String accountNum);
	List<Account> getAccountList(long customerId);
	List<Account> getAllAccount();
	
//	public AccountService(AccountDao accountDao) {
//		this.accountDao = accountDao;
//	}
//	
//	public void addAccount(Account account) {
//		accountDao.addAccount(account);
//	}
//	
//	public List<Account> findAccountByCustomerId(long customerId) {
//		return accountDao.findAccountByCustomerId(customerId);
//	}
//	
//	public long getUpdateBalance(String accountNum) {
//		return accountDao.getBalance(accountNum);
//	}
//	
//	public void transfer(double money, String withdrawAccountNum, String depositAccountNum) {
//		accountDao.transfer(money, withdrawAccountNum, withdrawAccountNum);
//	}
//	
//	public 	void saveInterest(String accountNum, double interestRate) {
//		accountDao.saveInterest(accountNum, interestRate);
//	}

}
