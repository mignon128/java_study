package com.varxyz.jv200.booktest;

public class Libary {
	private Book[] b = new Book[100];
	private static Libary li = new Libary();

	private Libary() {

	}

	public static Libary getLibary() {
		return li;
	}

	public void addBook(Book book) {
		int count = 0;
		Book[] b2 = null;
		for (int j = 0; j < b.length; j++) {
			if (b[j] != null) {
				count++;
			}
		}
		if (count == 100) {
			b2 = new Book[200];
			for (int i = 0; i < b.length; i++) {
				b2[i] = b[i];
			}
			b = b2;
		}

		for (int i = 0; i < b.length; i++) {
			if (b[i] == null) {
				b[i] = book;
				break;
			}
		}
	}

	public String getBook(int serial) {
		for (int i = 0; i < b.length; i++) {
			if (b[i].getSerial() == serial) {
				return b[i].getName();
			}
		}
		return "책 없음";
	}

}
