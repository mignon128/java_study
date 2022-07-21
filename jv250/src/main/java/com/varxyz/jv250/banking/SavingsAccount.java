package com.varxyz.jv250.banking;

public class SavingsAccount extends Account {
	private static final double DEFAULT_INTEREST_RATE = 0.03;
	private double interestRate;

	public SavingsAccount() {

	}

	public SavingsAccount(String accountNum, double balance) {
		this(accountNum, balance, DEFAULT_INTEREST_RATE);
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
