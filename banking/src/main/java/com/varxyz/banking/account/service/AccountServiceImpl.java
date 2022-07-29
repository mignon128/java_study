package com.varxyz.banking.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varxyz.banking.account.dao.AccountDao;
import com.varxyz.banking.account.domain.Account;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountDao accountDao;
	
	@Override
	public void addAccount(Account account) {
		accountDao.addAccount(account);
	}
	
	@Override
	public List<Account> getAccountByAccountNum(String accountNum) {
		return accountDao.findByAccountNum(accountNum);
	}
	
	@Override
	public List<Account> getAccountList(long customerId) {
		return accountDao.findByCustomerId(customerId);
	}
	
	@Override
	public List<Account> getAllAccount() {
		return accountDao.findAll();
	}

//	@Override
//	public long getBalance(String accountNum) {
//		return accountDao.getBalance(accountNum);
//	}
//
//	@Override
//	public void transfer(double money, String withdrawAccountNum, String depositAccountNum) {
//		accountDao.transfer(money, withdrawAccountNum, depositAccountNum);
//		
//	}
//
//	@Override
//	public void saveInterest(String accountNum, double interestRate) {
//		accountDao.saveInterest(accountNum, interestRate);
//	}

	
}
