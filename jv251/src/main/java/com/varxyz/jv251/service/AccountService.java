package com.varxyz.jv251.service;

import java.util.List;

import com.varxyz.jv251.dao.AccountDao;
import com.varxyz.jv251.domain.Account;

public class AccountService {
	private AccountDao accountDao;
	
	public AccountService(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void addAccount(Account account) {
		accountDao.addAccount(account);
	}
	
	public List<Account> getAccountBySsn(String ssn) {
		return accountDao.findAccountBySsn(ssn);
	}
	
	/*
	 * XXX-XX-XXX 형식의 계좌번호 생성
	 * 
	 * @return
	 */
	public String generateAccountNum() {
		return null;
	}
}
