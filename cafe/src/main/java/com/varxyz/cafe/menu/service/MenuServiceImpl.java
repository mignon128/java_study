package com.varxyz.cafe.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varxyz.cafe.menu.dao.MenuDao;
import com.varxyz.cafe.menu.domain.Menu;

@Service
public class MenuServiceImpl implements MenuService{
	
	@Autowired
	MenuDao menuDao;

	@Override
	public void addMenu(Menu menu) {
		menuDao.addMenu(menu);	
	}

	@Override
	public List<Menu> findAllMenu() {
		return menuDao.findAllMenu();
	}

	@Override
	public Menu findMenuBycid(long cid) {
		return menuDao.findMenuBycid(cid);
	}
}
