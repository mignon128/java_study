package com.varxyz.jv251.domain;

import com.varxyz.jv251.exception.OverdraftException;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public CheckingAccount() {
		
	}

	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}

	public void withdraw(double amount) throws OverdraftException {
		if (balance < amount) {
			// 잔고부족시 overdraftAmount 금액 한도 내에서 추가 출금을 승인
			double overdraftNeeded = amount - balance;
			if (overdraftAmount < overdraftNeeded) {
				throw new OverdraftException("에러 : 대월금 초과", balance, overdraftNeeded);
			} else {
				balance = 0.0;
				overdraftAmount -= overdraftNeeded;
			}
		} else {
			balance = balance - amount;
		}
	}

	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}
}
