package com.varxyz.banking.domain2;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}

	public void widthdraw(double amount) {
		if(balance < amount) {
			// 잔고부족시 overdraftAmount 금액 한도 내에서 추가 출금을 승인
		} else {
			balance = balance - amount;
		}
	}
}
