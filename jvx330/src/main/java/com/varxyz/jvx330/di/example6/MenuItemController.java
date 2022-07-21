package com.varxyz.jvx330.di.example6;

import org.springframework.beans.factory.annotation.Autowired;

public class MenuItemController {
	
	@Autowired
	private MenuItemService service; 

	
	public void getAllMenu() {
		service.findAllMenuItem();
	}
	
	public void serchMenuName(String name) {
		
	}

	public void addMenu(String name, double price) {
		
	}
	
}
