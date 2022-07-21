package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExAccount4 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";

		try {
			Class.forName(driver);
			System.out.println("LOADED DRIVER ----> " + driver);

			Connection con = DriverManager.getConnection(url, id, passwd);
			System.out.println("CONNECTED TO ----> " + url); // SQL을 전달하기 위해서(문자열로)

			String sql = "SELECT * FROM Account WHERE accountNum = '111-12-1234'";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				long aid = rs.getLong("aid");
				String balance = rs.getString("balance");
				String interestRate = rs.getString("interestRate");
				String overdraft = rs.getString("overdraft");
				String customerId = rs.getString("customerId");

				System.out.println(aid);
				System.out.println(balance);
				System.out.println(interestRate);
				System.out.println(overdraft);
				System.out.println(customerId);
				System.out.println("----------------------------------");
			}
			rs.close();
			stmt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}