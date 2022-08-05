package com.varxyz.cafe.menu;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.varxyz.cafe.menu.domain.Menu;

public class CategoryMenuRowMapper implements RowMapper<Menu> {

	@Override
	public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
		return null;
	}

//	@Override
//	public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
//		Menu menu = null;
//		char accType = rs.getString("accType").charAt(0);
//		if(accType == 'C') {
//			account = new CheckingAccount();
//			CheckingAccount ca = (CheckingAccount)account;
//			ca.setOverdraftAmount(rs.getDouble("overAonunt"));
//		}else {
//			account = new SavingsAccount();
//			SavingsAccount sa = (SavingsAccount)account;
//			sa.setInterestRate(rs.getDouble("interestRate"));
//		}
//		account.setAid(rs.getLong("aid"));
//		account.setCustomer(new Customer(rs.getLong("customerId")));
//		account.setAccountNum(rs.getString("accountNum"));
//		account.setAccType(accType);
//		account.setBalance(rs.getDouble("balance"));
//		account.setRegDate(rs.getTimestamp("regDate"));
//		
//		return account;
//	}

}
