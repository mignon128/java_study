package com.varxyz.banking.account;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.varxyz.banking.customer.Customer;

public class CustomerAccountRowMapper implements RowMapper<Account> {

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = null;
		char accType = rs.getString("accType").charAt(0);
		if(accType == 'C') {
			account = new CheckingAccount();
			CheckingAccount ca = (CheckingAccount)account;
			ca.setOverdraftAmount(rs.getDouble("overAonunt"));
		}else {
			account = new SavingsAccount();
			SavingsAccount sa = (SavingsAccount)account;
			sa.setInterestRate(rs.getDouble("interestRate"));
		}
		account.setAid(rs.getLong("aid"));
		account.setCustomer(new Customer(rs.getLong("customerId")));
		account.setAccountNum(rs.getString("accountNum"));
		account.setAccType(accType);
		account.setBalance(rs.getDouble("balance"));
		account.setRegDate(rs.getTimestamp("regDate"));
		
		return account;
	}

}
