package com.varxyz.jvx330.jdbc.example5;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.jdbc.Account;
import com.varxyz.jvx330.jdbc.Customer;

public class AccountTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Example5Config.class);

		AccountDao dao = context.getBean("accountDao", AccountDao.class);
//		addAccount(dao);
		addAccount2(dao);
		findAccountBySsn(dao);
		findAllAccounts(dao);
		findAccountByCustomerId(dao);

		context.close();
	}
	
	public static void addAccount(AccountDao dao) {
		SavingsAccount sa = new SavingsAccount();
		
		sa.setAccountNum("777-77-777");
		sa.setBalance(5000.0);
		sa.setCustomer(new Customer(1001));
		sa.setInterestRate(0.04);
		sa.setRegDate(new Date());
		sa.setAccType('S');
		dao.addAccount(sa);
		System.out.println("----INSERTED----");
		
	}
	
	public static void addAccount2(AccountDao dao) {
		CheckingAccount ca = new CheckingAccount();
		
		ca.setAccountNum("113-33-132");
		ca.setBalance(5000.0);
//		ca.setCustomer(new Customer(1003, "spring@java.com", "1234", "조조", "990623-123467", "010-8888-9999"));
		ca.setOverdraftAmount(0.7);
		ca.setRegDate(new Date());
		ca.setAccType('C');
		dao.addAccount(ca);
		System.out.println("----INSERTED----");
		
	}

//	public static void addAccount(AccountDao dao) {
//		Account a = new Account();
//		a.setCustomerId(1001);
//		a.setAccountNum("121-11-2222");
//		a.setAccType("S");
//		a.setBalance(5000.0);
//		a.setInterestRate(0.3);
//		a.setOverAmount(0.0);
//		dao.addAccount(a);
//		System.out.println("----INSERTED----");
//	}
//
//	public static void addAccount2(AccountDao dao) {
//		Account a = new Account();
//		a.setCustomerId(1002);
//		a.setAccountNum("111-21-4567");
//		a.setAccType("S");
//		a.setBalance(4000.0);
//		a.setInterestRate(0.2);
//		a.setOverAmount(0.0);
//		dao.addAccount(a);
//		System.out.println("----INSERTED----");
//	}

	public static void findAccountBySsn(AccountDao dao) {
		System.out.println("[findAccountBySsn()]");

		List<Account> list = dao.findAccountBySsn("880126-1234567");
		for (Account account : list) {
			System.out.println(account);
		}
	}

	public static void findAllAccounts(AccountDao dao) {
		System.out.println("[findAllAccounts()]");
		dao.findAllAccounts().forEach(a -> System.out.println(a));
	}

	public static void findAccountByCustomerId(AccountDao dao) {
		System.out.println("[findAccountByCustomerId()]");
		
		List<Account> list = dao.findAccountByCustomerId(1002);
		for (Account account : list) {
			System.out.println(account);
		}
	}
}
