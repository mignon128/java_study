package com.varxyz.jvx330.jdbc.example2;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.jdbc.Customer;
import com.varxyz.jvx330.jdbc.DataSourceConfig;

public class CustomerDaoTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		CustomerDao dao = context.getBean("customerDao", CustomerDao.class);
		findAllCustomers(dao);
		countCustomers(dao);
		findCustomerByEmail(dao);
		findCustomerBySsn(dao);
		findCustomerByRegDate(dao);
		context.close();
	}
	
	public static void findAllCustomers(CustomerDao dao) {
		System.out.println("[findAllCustomers()]");
		dao.findAllCustomers().forEach(c -> System.out.println(c));
	}
	
	public static void countCustomers(CustomerDao dao) {
		System.out.println("[countCustomers()]");
		long count = dao.countCustomers();
		System.out.println(count);
	}
	
	public static void findCustomerByEmail(CustomerDao dao) {
		System.out.println("[findCustomerByEmail()]");
		Customer c = dao.findCustomerByEmail("yubi@java.com");
		System.out.println(c);
	}
	
	public static void findCustomerBySsn(CustomerDao dao) {
		System.out.println("[findCustomerBySsn()]");
		Customer c = dao.findCustomerBySsn("920331-1234567");
		System.out.println(c);
	}
	
	public static void findCustomerByRegDate(CustomerDao dao){
		System.out.println("[findCustomerByRegDate()]");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date currentDate = null;
		try {
			currentDate = format.parse(format.format(new Date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		List<Customer> list = dao.findCustomerByRegDate(currentDate);
		for(Customer customer : list) {
			System.out.println(customer);
		}
	}
}