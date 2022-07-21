package com.varxyz.jv200.mod004;

//import java.util.Calendar;
//import java.util.Date;

public class Employee {
	protected String name;
	protected double salary;
	public MyDate birthDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getDetails() {
		return "Name: " + name + "\nSalary: " + salary;
	}
 
	public boolean equals(Object o) {
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			if (e.getName().equals(name) && e.getBirthDate().equals(birthDate)) {
				return true;
			}
		}
		return false;
	}

//	public static Date getDate(int year, int month, int date) {
//		Calendar cal = Calendar.getInstance();
//		cal.set(year, month - 1, date);
//		return new Date(cal.getTimeInMillis());
//	}
}
