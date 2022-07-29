package com.varxyz.banking.customer.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.varxyz.banking.customer.domain.Customer;
import com.varxyz.banking.customer.service.CustomerService;

@Controller("customer.customerController")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/customer/add_customer")
	public String addCustomerform(Model model) {
//		model.addAttribute("customer", new Customer());
		
		return "customer/add_customer";
	}

	
	@PostMapping("/customer/add_customer")
	public String addCustomer(Customer customer, Model model) {
		service.addCustomer(customer);
		model.addAttribute("customer", customer);
		
		return "customer/success_add_customer";
	}
	
	@GetMapping("/customer/login")
	public String loginFore() {
		return "customer/login";
	}

	@PostMapping("/customer/login")
	public ModelAndView login(@RequestParam String userId, @RequestParam String passwd, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("userId", userId);
		mav.addObject("passwd", passwd);
		mav.setViewName("customer/mypage");
		
		return mav;	
	}
	
	@GetMapping("/customer/customer_list")
	public String customerList(Model model) {
		List<Customer> cusotmerList = service.getAllCustomer();
		model.addAttribute("cusotmerList", cusotmerList);
		
		return "customer/customer_list";
	}

	@GetMapping("/customer/customer_update")
	public String customerUpdateForm() {
		return "customer/customer_update";

	}
	
	@PostMapping("/customer/customer_update")
	public String update(Customer customer, Model model) {
		service.updateCustomer(customer);
		model.addAttribute("customer", customer);
		
		return "customer/login";
	}

}
//sandredirect = return "redirect:/index"; 