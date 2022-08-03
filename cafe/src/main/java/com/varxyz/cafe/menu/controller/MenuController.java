package com.varxyz.cafe.menu.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.varxyz.cafe.menu.domain.Menu;
import com.varxyz.cafe.menu.domain.MenuCommand;
import com.varxyz.cafe.menu.service.MenuServiceImpl;

@Controller("menu.menuController")
public class MenuController {

	@Autowired
	private MenuServiceImpl menuServiceImpl;

	@GetMapping("/menu/add_menu")
	public String addMenuform(Model model) {
		model.addAttribute("menu", new Menu());
		return "menu/add_menu";
	}

	@ModelAttribute("CategoryList")
	public List<String> getCategoryList() {
		List<String> list = new ArrayList<String>();
		list.add("커피");
		list.add("티");
		list.add("프라푸치노");

		return list;
	}
	
	@PostMapping("/menu/add_menu")
	public String addMenu(@ModelAttribute("menu") MenuCommand menu, Model model) throws IOException {
		System.out.println("진입");
//		String category = menu.getCategory();
//		menu.setCategory(category);

		MultipartFile file = menu.getImgFile();
		System.out.println(file);
		String fileName = file.getOriginalFilename();
		System.out.println(fileName);
		// 업로드 파일이 저장될 경로
		String filePath = "C:\\NCS\\eclipse-workspace\\cafe\\src\\main\\webapp\\resources\\img\\";
		String fullPath = filePath + fileName;
		file.transferTo(new File(fullPath));
		model.addAttribute("menu", menu);
//		menuServiceImpl.addMenu(menu);
		return "menu/success_add_menu";
	}

	@GetMapping("/menu/menu_list")
	public String customerList(Model model) {
		List<Menu> menuList = menuServiceImpl.findAllMenu();
		model.addAttribute("menuList", menuList);

		return "menu/menu_list";
	}
	
	@Bean
	public CommonsMultipartResolver mutipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setDefaultEncoding("utf-8");
		return resolver;
	}

//	@GetMapping("/menu/menu_update")
//	public String customerUpdateForm() {
//		return "menu/menu_update";
//
//	}
//	
//	@PostMapping("/menu/menu_update")
//	public String update(Menu menu, Model model) {
//		menuServiceImpl.
//		model.addAttribute("menu", menu);
//		
//		return "customer/login";
//	}

}
//sandredirect = return "redirect:/index"; 