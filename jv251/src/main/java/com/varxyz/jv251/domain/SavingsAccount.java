package com.varxyz.jv251.domain;

import com.varxyz.jv251.exception.InsufficientBalanceException;

public class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount() {

	}

	public SavingsAccount(String accountNum, double balance) {
		this(accountNum, balance, 0.0);
	}

	public SavingsAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	public void withdraw(double amount) {
		if (balance - amount < 0) {
			throw new InsufficientBalanceException("잔고부족", balance);
		}
		super.balance -= amount;
	}

	public double getIntersetRate() {
		return interestRate;
	}

	public void setIntersetRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
