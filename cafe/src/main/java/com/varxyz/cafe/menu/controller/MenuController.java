package com.varxyz.cafe.menu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.cafe.menu.service.MenuServiceImpl;

@Controller("menu.menuController")
public class MenuController {
	
	@Autowired
	private MenuServiceImpl menuServiceImpl;

	@GetMapping("/account/add_account")
	public String addAccountform() {
		return "account/add_account";
	}

}
//sandredirect = return "redirect:/index"; 