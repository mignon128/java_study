package com.varxyz.banking.customer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Customer {
	private long cid;
	private String email;
	private String passwd;
	private String name;
	private String ssn;
	private String phone;
	
	public Customer() {
		super();
	}
	
	public Customer(long cid) {
		this.cid = cid;
	}
}

