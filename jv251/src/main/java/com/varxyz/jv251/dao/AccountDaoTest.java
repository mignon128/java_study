package com.varxyz.jv251.dao;

import java.util.Date;

import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.Customer;
import com.varxyz.jv251.domain.SavingsAccount;

public class AccountDaoTest {
	public static void main(String[] args) {
		AccountDao dao = new AccountDao();
		
		SavingsAccount sa = new SavingsAccount();
		sa.setAccountNum("111-21-5678");
		sa.setBalance(3000.0);
		sa.setCustomer(new Customer(1001));
		sa.setIntersetRate(0.04);
		sa.setRegDate(new Date()); // 현재 시간이 찍힘
		sa.setAccountType('S');
//		dao.addAccount(sa);
		for(Account account : dao.findAccountBySsn("901213-1234567")) {
			System.out.println(account);
		}
	}
}
