package com.varxyz.jv200.mod004;

//import java.util.Date;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "유비";
		e.salary = 1000.0;
//		e.birthDate = new Date();
//		String detail = e.getDetails();
		System.out.println(e.birthDate);
//		Date date = Employee.getDate(2021, 9, 3);
//		System.out.println(date);
		
		Manager m = new Manager();
		m.department = "영업부";
		m.name = "관우";
		m.salary = 2000.0;
		System.out.println(m.getDetails());
		
		Director d = new Director();
		d.department = "관리부";
		d.name = "장비";
		d.salary = 3000.0;
		System.out.println(d.getDetails());
	}
}
