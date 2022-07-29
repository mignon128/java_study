package com.varxyz.jv250.banking;

import java.util.Date;

public abstract class Account {
	protected String accountNum;
	protected double balance;
	protected Customer customer;
	protected char accountType;
	protected long aid;
	protected Date regDate;

	public Account() {

	}

	@Override
	public String toString() {
		return "계좌번호 : " + accountNum + ", 금액 : " + balance + " " + customer + ", 계좌id : " + aid + "Date : " + regDate;
	}

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
		return customer;
	}

	public char getAccountType() {
		return accountType;
	}

	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}

	public long getAid() {
		return aid;
	}

	public void setAid(long aid) {
		this.aid = aid;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
}
