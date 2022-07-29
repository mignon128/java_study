package com.varxyz.banking.account.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.banking.account.domain.Account;
import com.varxyz.banking.account.domain.CheckingAccount;
import com.varxyz.banking.account.domain.SavingsAccount;
import com.varxyz.banking.account.service.AccountService;
import com.varxyz.banking.customer.service.CustomerService;

@Controller("account.accountController")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	CustomerService customerService;

	@GetMapping("/account/add_account")
	public String addAccountform() {
		return "account/add_account";
	}

	
	@PostMapping("/account/add_account")
	public String addCustomer(HttpServletRequest request) {
		char accType = request.getParameter("accType").charAt(0);
		Account account = null;
		
		if(accType == 'S') {
			account = new SavingsAccount();
		}else if (accType == 'C') {
			account = new CheckingAccount();
		}
		
		account.setAccountNum(generateAccount());
		account.setAccType(accType);
		accountService.addAccount(account);
		request.setAttribute("accType", account.getAccountNum());
		
		return "account/success_add_account";
	}
	
	/**
	 * XXX-XX-XXXX 형식의 계좌번호 생성.
	 * 
	 * @return
	 */
	public String generateAccount() {
		String numStr = String.valueOf((int)(Math.random() * 100000000));
		StringBuilder sb = new StringBuilder();
		sb.append(numStr.substring(0, 3));
		sb.append("-");
		sb.append(numStr.substring(3, 5));
		sb.append("-");
		sb.append(numStr.substring(5));
		
		return sb.toString();
	}

}
//sandredirect = return "redirect:/index"; 