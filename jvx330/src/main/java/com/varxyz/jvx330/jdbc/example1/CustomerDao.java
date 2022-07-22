package com.varxyz.jvx330.jdbc.example1;

import java.util.Date;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.jvx330.jdbc.Customer;

public class CustomerDao {
	private JdbcTemplate jdbcTemplate;

	public CustomerDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Customer> findAllCustomers() {
		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate FROM Customer";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Customer>(Customer.class));
	}

	public List<Customer> findCustomerByRegDate(Date regDate) {
		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate FROM Customer WHERE DATE(regDate)=?";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Customer>(Customer.class), regDate);
	}

	public Customer findCustomerByEmail(String email) {
		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate FROM Customer WHERE email=?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Customer>(Customer.class), email);
	}
	
	public long countCustomers() {
		String sql = "SELECT count(*) FROM Customer";
		return jdbcTemplate.queryForObject(sql, Long.class);
	}
	
	public Customer findCustomerBySsn(String ssn) {
		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate FROM Customer WHERE ssn=?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Customer>(Customer.class), ssn);
	}

}


//public class CustomerDao {
//	private JdbcTemplate jdbcTemplate;
//
//	public CustomerDao(DataSource dataSource) {
//		jdbcTemplate = new JdbcTemplate(dataSource);
//	}
//
//	public List<Customer> findAllCustomers() {
//		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate FROM Customer";
//		return jdbcTemplate.query(sql, new CustomerRowMapper());
//	}
//
//	public List<Customer> findCustomerByRegDate(Date regDate) {
//		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate FROM Customer WHERE DATE(regDate)=?";
//		return jdbcTemplate.query(sql, new CustomerRowMapper(), regDate);
//	}
//
//	public Customer findCustomerByEmail(String email) {
//		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate FROM Customer WHERE email=?";
//		return jdbcTemplate.queryForObject(sql, new CustomerRowMapper(), email);
//	}
//	
//	public long countCustomers() {
//		String sql = "SELECT count(*) FROM Customer";
//		return jdbcTemplate.queryForObject(sql, Long.class);
//	}
//	
//	public Customer findCustomerBySsn(String ssn) {
//		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate FROM Customer WHERE ssn=?";
//		return jdbcTemplate.queryForObject(sql, new CustomerRowMapper(), ssn);
//	}
//
//}


//public class CustomerDao {
//	private JdbcTemplate jdbcTemplate;
//
//	public CustomerDao(DataSource dataSource) {
//		jdbcTemplate = new JdbcTemplate(dataSource);
//	}
//
//	public List<Customer> findAllCustomers() {
//		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate FROM Customer";
//		return jdbcTemplate.query(sql, new RowMapper<Customer>() {
//
//			@Override
//			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Customer customer = new Customer(rs.getLong("cid"), rs.getString("email"), rs.getString("passwd"),
//						rs.getString("name"), rs.getString("ssn"), rs.getString("phone"), rs.getTimestamp("regDate"));
//				return customer;
//			}
//
//		});
//	}
//
//	public List<Customer> findCustomerByRegDate(Date regDate) {
//		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate FROM Customer WHERE DATE(regDate)=?";
//		return jdbcTemplate.query(sql, new RowMapper<Customer>() {
//
//			@Override
//			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Customer customer = new Customer(rs.getLong("cid"),rs.getString("email"), rs.getString("passwd"),
//						rs.getString("name"), rs.getString("ssn"), rs.getString("phone"), rs.getTimestamp("regDate"));
//				return customer;
//			}
//			
//		}, regDate);
//	}
//
//	public Customer findCustomerByEmail(String email) {
//		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate FROM Customer WHERE email=?";
//		return jdbcTemplate.queryForObject(sql, new RowMapper<Customer>() {
//
//			@Override
//			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Customer customer = new Customer(rs.getLong("cid"), rs.getString("email"), rs.getString("passwd"),
//						rs.getString("name"), rs.getString("ssn"), rs.getString("phone"), rs.getTimestamp("regDate"));
//				return customer;
//			}
//		}, email);
//	}
//	
//	public long countCustomers() {
//		String sql = "SELECT count(*) FROM Customer";
//		return jdbcTemplate.queryForObject(sql, Long.class);
//	}
//	
//	public Customer findCustomerBySsn(String ssn) {
//		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate FROM Customer WHERE ssn=?";
//		return jdbcTemplate.queryForObject(sql, new RowMapper<Customer>() {
//
//			@Override
//			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Customer customer = new Customer(rs.getLong("cid"), rs.getString("email"), rs.getString("passwd"),
//						rs.getString("name"), rs.getString("ssn"), rs.getString("phone"), rs.getTimestamp("regDate"));
//				return customer;
//			}
//		}, ssn);
//	}
//
//}
