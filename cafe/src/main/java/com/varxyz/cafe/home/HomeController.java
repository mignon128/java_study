package com.varxyz.cafe.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/manager/mypage")
	public String mypage() {
		return "/manager/mypage";
	}

//	
//	@GetMapping("/manager/mypage")
//	public String mypage() {
//		return "/manager/mypage";
//	}
}
//sandredirect = return "redirect:/index"; 