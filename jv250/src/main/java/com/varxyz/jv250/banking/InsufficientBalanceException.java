package com.varxyz.jv250.banking;

public class InsufficientBalanceException extends RuntimeException {
	private double balance;

	public InsufficientBalanceException(String msg, double balance) {
		super(msg);
		this.balance = balance;
	}

	@Override
	public String getMessage() {
		return "현재 잔고는 " + balance + "원 입니다.";
	}

//	public InsufficientBalanceException(String msg) {
//	      super(msg);
//	   }
}
