package com.varxyz.cafe.admin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

import com.varxyz.cafe.category.domain.Category;
import com.varxyz.cafe.category.service.CategoryServiceImpl;
import com.varxyz.cafe.menu.domain.Menu;
import com.varxyz.cafe.menu.service.MenuServiceImpl;

@Controller("admin.orderController")
public class OrderController {

	@Autowired
	private MenuServiceImpl menuServiceImpl;
	private CategoryServiceImpl cateServiceImpl;

	@GetMapping("/admin/order")
	public String order(HttpServletRequest request) {
		List<Category> cateList = cateServiceImpl.findAllCategory();
		request.setAttribute("cateList", cateList);
		
		String cid = request.getParameter("cid");
		long cId = Long.parseLong(cid);
		Menu menuList = menuServiceImpl.findMenuBycid(cId);
		request.setAttribute("menuList", menuList);
		
		return "/admin/order";
	}


	//메뉴불러오는건 맵을 이용해 캐싱
	

}
//sandredirect = return "redirect:/index"; 