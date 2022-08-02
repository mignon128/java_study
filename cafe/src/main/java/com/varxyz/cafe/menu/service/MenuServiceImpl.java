package com.varxyz.cafe.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.varxyz.cafe.menu.dao.MenuDao;
import com.varxyz.cafe.menu.domain.Menu;

public class MenuServiceImpl{
	
	@Autowired
	MenuDao menuDao;

	public void addMenu(Menu menu) {
		menuDao.addMenu(menu);
	}
	
	public List<Menu> findAllMenu() {
		return menuDao.findAllMenu();
	}
	
	public List<Menu> findMenuByctype(String ctype) {
		return menuDao.findMenuByctype(ctype);
	}
}
