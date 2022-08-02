package com.varxyz.cafe.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varxyz.cafe.menu.dao.MenuDao;

@Service
public class MenuService {
	
	@Autowired
	public MenuDao menuDao;
	
	public MenuService(MenuDao menuDao) {
		this.menuDao = menuDao;
	}

}
