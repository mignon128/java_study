package com.varxyz.jvx330.mvc.example5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("example5.addCustomerController")
@RequestMapping("/example5/add_customer")
public class AddCustomerController {
	@GetMapping
	public String addCustomerform(Model model) {
		model.addAttribute("customer", new CustomerCommand());
		return "example5/add_customer";
	}

	@ModelAttribute("emailProviderList")
	public List<EmailProvider> getEmailProviderList() {
		List<EmailProvider> list = new ArrayList<EmailProvider>();
		list.add(new EmailProvider("Google", "gmail.com"));
		list.add(new EmailProvider("Naver", "naver.com"));
		list.add(new EmailProvider("Daum", "kakao.com"));

		return list;
	}

	@ModelAttribute("PhoneProviderList")
	public List<String> getPhoneProviderList() {
		List<String> list = new ArrayList<String>();
		list.add("010");
		list.add("011");
		list.add("016");

		return list;
	}

	@PostMapping
	public String addCustomer(@ModelAttribute("customer") CustomerCommand customer, Model model) {
		// dbó�� ��
		// customer = cusotmerService.addCustomer(customer);
		String email = customer.getEmail1() + "@" + customer.getEmail2();
		String phone = customer.getPhone1() + "-" + customer.getPhone2() + "-" + customer.getPhone3();
		model.addAttribute("customer", customer);
		customer.setEmail(email);
		customer.setPhone(phone);
		return "example5/success_add_customer";
		
	}
}
