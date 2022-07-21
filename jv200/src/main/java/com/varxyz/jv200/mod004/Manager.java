package com.varxyz.jv200.mod004;

public class Manager extends Employee {
	protected String department;
	
	// method overriding
	@Override
	public String getDetails() {
		return super.getDetails() + "\nDepartment: " + department;
	}
}