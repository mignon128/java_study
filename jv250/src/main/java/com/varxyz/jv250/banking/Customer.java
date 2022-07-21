package com.varxyz.jv250.banking;

import java.util.Date;
import java.util.List;

public class Customer {
	private long cid;
	private String name;
	private String ssn;
	private String phone;
	private String customerId;
	private String passwd;
	private List<Account> accountList;
	private Date regDate;

//	public Customer(String name, String ssn, String phone, String customerId, String passwd) {
//		this.name = name;
//		this.ssn = ssn;
//		this.phone = phone;
//		this.customerId = customerId;
//		this.passwd = passwd;
//	}

	public Customer(String name, String ssn, String phone) {
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
	}

	public Customer() {
	}

	public Customer(long cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", cid : " + cid + ", 주민번호 : " + ssn + ", 폰번호 : " + phone + ", 고객Id : " + customerId
				+ ", 비밀번호 : " + passwd;

	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(Account a) {
		accountList.add(a);
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
}