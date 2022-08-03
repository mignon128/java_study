package com.varxyz.jvx330.mvc.example6;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("example6.addCustomerController")
@RequestMapping("/example6/add_customer")
public class AddAccountController {
	@GetMapping
	public String addCustomerform(Model model) {
		model.addAttribute("customer", new AccountCommand());
		return "example6/add_customer";
	}


	@PostMapping
	public String addCustomer(@ModelAttribute("customer") AccountCommand customer, Model model) {
		// db√≥∏Æ µÓ
		// customer = cusotmerService.addCustomer(customer);
		String email = customer.getEmail1() + "@" + customer.getEmail2();
		String phone = customer.getPhone1() + "-" + customer.getPhone2() + "-" + customer.getPhone3();
		model.addAttribute("customer", customer);
		customer.setEmail(email);
		customer.setPhone(phone);
		return "exampl6/success_add_customer";
		
	}
}
