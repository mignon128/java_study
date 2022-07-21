package com.varxyz.jv200.mod004;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public boolean equals(Object o) {
		if (o instanceof MyDate) {
			MyDate d = (MyDate) o;
			if (day == d.day && month == d.month && year == d.year) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		MyDate d1 = new MyDate(1,1,2000);
		MyDate d2 = new MyDate(2,1,2000);
		
		boolean flag = d1.equals(d2);
		System.out.println(flag);
	}
}
