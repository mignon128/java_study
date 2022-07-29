package com.varxyz.jvx330.mvc.example3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("example3.loginController")
public class LoginController {

	@GetMapping("/example3/login")
	public String loginFore() {
		return "example3/login";
	}

//	@PostMapping("/example3/login")
	public ModelAndView login(HttpServletRequest request, ModelAndView mav) {
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		
//		ModelAndView mav = new ModelAndView(); - ModelAndView mav를 적어주면서 필요가 없어짐
		mav.addObject("userId", userId);
		mav.addObject("passwd", passwd);
		mav.setViewName("example3/login_result");
		
		return mav;	
	}

	@PostMapping("/example3/login")
	public ModelAndView login(@RequestParam String userId, @RequestParam String passwd) {
		// String userId = request.getParameter("userId"); = @RequestParam(value="userId", required = true) String id
		// value="userId"를 String id에 넣어줌 / required = true (값이 있어야함)
		ModelAndView mav = new ModelAndView();
		mav.addObject("userId", userId);
		mav.addObject("passwd", passwd);
		mav.setViewName("example3/login_result");
		
		return mav;	
	}
}
