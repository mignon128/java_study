package com.varxyz.banking.mod001;

public abstract class SavingsAccount extends Account {
	private static final double DEFAULT_INTEREST_RATE = 0.03;
	private double interestRate; // 이자율

	public SavingsAccount(String accountNum, double balance) {
		this(accountNum, balance, DEFAULT_INTEREST_RATE);
	}

	public SavingsAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if (balance - amount < 0) {
			throw new InsufficientBalanceException("잔고부족", balance);
		}
		super.balance -= amount;
	}
}
