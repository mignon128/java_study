package com.varxyz.cafe.category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.cafe.category.domain.CategoryCommand;
import com.varxyz.cafe.category.service.CategoryServiceImpl;
import com.varxyz.cafe.menu.domain.MenuCommand;

@Controller("category.categoryController")
public class CategoryController {
	
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;

	@GetMapping("/category/add_category")
	public String addCategoryform() {
		return "category/add_category";
	}

	@PostMapping("/category/add_category")
	public String addCategory(@ModelAttribute("category") CategoryCommand category, Model model) {
		model.addAttribute("category", category);
//		categoryServiceImpl.addCategory(category);
		return "category/success_add_category";
	}

}
//sandredirect = return "redirect:/index"; 