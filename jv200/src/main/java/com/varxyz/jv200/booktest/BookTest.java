package com.varxyz.jv200.booktest;

public class BookTest {
	public static void main(String[] args) {
		Libary li = Libary.getLibary();
		li.addBook(new Book(1,"abc"));
		System.out.println(li.getBook(1));
	}
}
