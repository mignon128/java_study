package com.varxyz.banking.mod001;

import com.varxyz.banking.domain.customer.Customer;

public abstract class Account {
	private String accountNum;
	protected double balance;
	protected Customer customer;
	
	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		this.balance += amount;
	}
	
	 public abstract void withdraw(double amount) throws Exception;

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
}
