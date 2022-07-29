package com.varxyz.jvx330.di.example6;

/*
MenuItemService의 기능
	- 신규 MenuItem 등록
	- 등록된 모든 메뉴 조회
	- 메뉴이름으로 메뉴 검색
*/

public interface MenuItemService {
	
	void addMenuItem(String name, double price);
	void findAllMenuItem();
	void serchMenuName(String name);
}
