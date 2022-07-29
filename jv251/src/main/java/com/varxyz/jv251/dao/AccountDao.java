package com.varxyz.jv251.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.CheckingAccount;
import com.varxyz.jv251.domain.Customer;
import com.varxyz.jv251.domain.SavingsAccount;

public class AccountDao {
	/*
	 * 신규 계좌 등록
	 * @param account		[SavingAccount	|	CheckingAccount] 
	 */
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account(accountNum, balance, interestRate, overdraft, accountType, customerId) VALUES(?, ?, ?, ?, ?, ?)";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = DataSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, account.getAccountNum());
				pstmt.setDouble(2, account.getBalance());
				if (account instanceof SavingsAccount) {
					SavingsAccount sa = (SavingsAccount) account;
					pstmt.setDouble(3, sa.getIntersetRate());
					pstmt.setDouble(4, 0.0);
					pstmt.setString(5, String.valueOf('S'));
				} else if (account instanceof CheckingAccount) {
					CheckingAccount ca = (CheckingAccount) account;
					pstmt.setDouble(3, 0.0);
					pstmt.setDouble(4, ca.getOverdraftAmount());
					pstmt.setString(5, String.valueOf('C'));
				}
				pstmt.setLong(6, account.getCustomer().getCid());
				pstmt.executeUpdate();
			} finally {
				DataSourceManager.close(pstmt, con);
			}
			System.out.println("NEW ACCOUNT INSERTED...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Account> findAccountBySsn(String ssn) {
		String sql = "SELECT a.aid, a.customerId, a.accountNum, a.balance, a.interestRate, a.overdraft, a.accType,"
				+ " c.name, c.ssn, c.phone, a.regDate"
				+ " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid WHERE c.ssn = ?";

		List<Account> accountList = new ArrayList<>();

		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con =DataSourceManager.getConnection();
				pstmt = con.prepareStatement(sql); 
				pstmt.setString(1, ssn);
				rs = pstmt.executeQuery();
				Account account = null;

				while (rs.next()) {
					if (rs.getString("accountType").charAt(0) == 'S') {
						account = new SavingsAccount();
						((SavingsAccount) account).setIntersetRate(rs.getDouble("interestRate"));
					} else {
						account = new CheckingAccount();
						((CheckingAccount) account).setOverdraftAmount(rs.getDouble("overdraft"));
					}
					account.setAid(rs.getLong("aid"));
					account.setAccountNum(rs.getString("accountNum"));
					account.setBalance(rs.getDouble("balance"));
					account.setCustomer(new Customer(rs.getString("name"), rs.getString("ssn"), rs.getString("phone")));
					account.setRegDate(rs.getTimestamp("regDate"));
					account.setAccountType(rs.getString("accountType").charAt(0));
					accountList.add(account);
				}
			} finally {
				DataSourceManager.close(rs, pstmt, con);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return accountList;
	}
}
