package com.varxyz.cafe.menu.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.varxyz.cafe.menu.domain.Menu;
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
//		HttpSession session = request.getSession(false);

		String cid =  request.getParameter("cid");
		long c = Long.parseLong(cid);
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String size = request.getParameter("size");
		String kcal = request.getParameter("kcal");
		String count = request.getParameter("count");
		System.out.println(file.getOriginalFilename());
	

		Menu menu = new Menu();
		menu.setCid(c);
		menu.setName(name);
		menu.setPrice(Double.valueOf(price));
		menu.setSize(size);
		menu.setKcal(Double.valueOf(kcal));
		menu.setCount(Integer.valueOf(count));

		System.out.println(request.getParameter("name"));
		model.addAttribute("menu", menu);
		
		
		String filePath = "C:\\NCS\\eclipse-workspace\\cafe\\src\\main\\webapp\\resources\\img\\";
		File saveDir = new File(filePath);
		if (!saveDir.exists()) {
			saveDir.mkdir(); // 폴더 만들기
		}
		File newFile = new File(saveDir.getPath() + File.separator + file.getOriginalFilename());
		file.transferTo(newFile);
		menu.setImgName(file.getOriginalFilename());
		menuServiceImpl.addMenu(menu);
		return "menu/success_add_menu";
	}
	

}
//sandredirect = return "redirect:/index"; 