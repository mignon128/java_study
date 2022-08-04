package com.varxyz.cafe.menu.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
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
//		model.addAttribute("menu", new MenuCommand());
		return "menu/add_menu";
	}

//	@ModelAttribute("categoryList")
//	public List<String> getCategoryList() {
//		List<String> list = new ArrayList<String>();
//		list.add("커피");
//		list.add("티");
//		list.add("프라푸치노");
//
//		return list;
//	}
//	
//	@ModelAttribute("sizeList")
//	public List<String> getSizeList() {
//		List<String> list = new ArrayList<String>();
//		list.add("Tall");
//		list.add("Grande");
//		list.add("Venti");
//
//		return list;
//	}

	@PostMapping("/menu/add_menu")
	public String addMenu(HttpServletRequest request, Model model, @RequestParam("imgFile") MultipartFile file)
			throws IllegalStateException, IOException {
		System.out.println("진입");
		String category = request.getParameter("category");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String size = request.getParameter("size");
		String kcal = request.getParameter("kcal");
		String count = request.getParameter("count");
		System.out.println(file.getOriginalFilename());

		MenuCommand menu = new MenuCommand();
		menu.setCategory(category);
		menu.setName(name);
		menu.setPrice(price);
		menu.setSize(size);
		menu.setKcal(kcal);
		menu.setCount(count);
		
		System.out.println(request.getParameter("name"));
//		cate.setCateType(request.getParameter("cateType"));
//		cate.setCateName(request.getParameter("cateName"));
//		MenuItemCommand command = new MenuItemCommand(cate, (String) request.getParameter("name"),
//				Double.parseDouble(request.getParameter("price")), imageFile);
//		menuService.addMenuItem(command);

		String filePath = "C:\\NCS\\eclipse-workspace\\cafe\\src\\main\\webapp\\resources\\img\\";

		model.addAttribute("menu", menu);
		

		File saveDir = new File(filePath);
		if(!saveDir.exists()) {
			saveDir.mkdir(); // 폴더 만들기
		}
		File newFile = new File(saveDir.getPath() + File.separator + file.getOriginalFilename());
		file.transferTo(newFile);
		menu.setImgName(file.getOriginalFilename());
		
		return "menu/success_add_menu";
	}

	@GetMapping("/menu/menu_list")
	public String customerList(Model model) {
		List<Menu> menuList = menuServiceImpl.findAllMenu();
		model.addAttribute("menuList", menuList);

		return "menu/menu_list";
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