package com.varxyz.cafe.category.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.cafe.category.service.CategoryService;
import com.varxyz.cafe.category.service.CategoryServiceImpl;

@Controller("category.categoryController")
public class CategoryController {
	
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;

	@GetMapping("/category/add_account")
	public String addAccountform() {
		return "account/add_account";
	}


}
//sandredirect = return "redirect:/index"; 