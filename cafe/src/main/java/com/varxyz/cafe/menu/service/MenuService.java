package com.varxyz.cafe.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varxyz.cafe.menu.dao.MenuDao;
import com.varxyz.cafe.menu.domain.Menu;

@Service
public interface MenuService {
	
	void addMenu(Menu menu);
	List<Menu> findAllMenu();
	Menu findMenuBycid(long cid);
}
