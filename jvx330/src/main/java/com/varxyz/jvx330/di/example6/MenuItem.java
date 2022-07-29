package com.varxyz.jvx330.di.example6;

/*
메뉴(MenuItem)
	- 메뉴이름(name)
	- 메뉴가격(price)

하나 이상의 신규 메뉴를 등록하고 등록된 목록을 출력하고 메뉴명으로 메뉴를 검색할 수 있도록 구현
*/

public class MenuItem {
	private String name;
	private double price;
	
	public MenuItem(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "MenuItem [name=" + name + ", price=" + price + "]";
	}
	
}
