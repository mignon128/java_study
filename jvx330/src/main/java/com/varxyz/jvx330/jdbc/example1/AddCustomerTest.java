package com.varxyz.jvx330.jdbc.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.jdbc.Customer;
import com.varxyz.jvx330.jdbc.DataSourceConfig;

public class AddCustomerTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		AddCustomerDao dao = context.getBean("addCustomerDao", AddCustomerDao.class);
//		addCustomer(dao);
//		addCustomer2(dao);
		addCustomer3(dao);
		
		context.close();
	}
	
	public static void addCustomer(AddCustomerDao dao) {
		Customer c = new Customer();
		c.setEmail("jojo@java.com");
		c.setPasswd("2222");
		c.setName("조조");
		c.setSsn("900202-1234567");
		c.setPhone("010-2894-1234");
		dao.addCustomer2(c);
		System.out.println("----INSERTED----");

	}
	
	public static void addCustomer2(AddCustomerDao dao) {
		Customer c = new Customer();
		c.setEmail("jangbi@java.com");
		c.setPasswd("333");
		c.setName("장비");
		c.setSsn("920331-1234567");
		c.setPhone("010-9938-2285");
		dao.addCustomer2(c);
		System.out.println("----INSERTED----");

	}
	
	public static void addCustomer3(AddCustomerDao dao) {
		Customer c = new Customer();
		c.setEmail("kawnou@java.com");
		c.setPasswd("1234");
		c.setName("관우");
		c.setSsn("890513-1234567");
		c.setPhone("010-6654-3356");
		
		long key = dao.addCustomer3(c);
		System.out.println("--Key--" + key);

	}
}
