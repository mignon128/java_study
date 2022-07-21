package com.varxyz.jvx330.di.example6;

import java.util.ArrayList;
import java.util.List;

public class MenuItemServiceImp implements MenuItemService {
	List<MenuItem> menulist = new ArrayList<>();

	@Override
	public void addMenuItem(String name, double price) {
		System.out.println("menuItem : " + name + ", " + price);
	}

	public void findAllMenuItem() {

		for (MenuItem m : menulist) {
			System.out.println(m);
		}
	}

	@Override
	public void serchMenuName(String name) {
		System.out.println("메뉴는 " + name + "입니다.");
	}

}
