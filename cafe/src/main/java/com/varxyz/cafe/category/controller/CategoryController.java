package com.varxyz.cafe.category.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.varxyz.cafe.category.domain.Category;
import com.varxyz.cafe.category.service.CategoryServiceImpl;
import com.varxyz.cafe.menu.controller.MemberVO;
import com.varxyz.cafe.menu.domain.Menu;

@Controller("category.categoryController")
public class CategoryController {

	@Autowired
	private CategoryServiceImpl categoryServiceImpl;

	@GetMapping("/category/add_category")
	public String addCategoryform() {
		return "category/add_category";
	}

	@PostMapping("/category/add_category")
	public String addCategory(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");

		Category category = new Category();
		category.setCatename(name);

		List<Category> list = categoryServiceImpl.findAllCategory();
		request.setAttribute("list", list);

		model.addAttribute("category", category);
		categoryServiceImpl.addCategory(category);
		return "category/success_add_category";
	}

	   @GetMapping("/category/{cid}")
	   public List<Category> findCategoryByCid(@RequestParam Long cid){
	      return categoryServiceImpl.findCategoryByCid(cid);
	   }
}
//sandredirect = return "redirect:/index"; 