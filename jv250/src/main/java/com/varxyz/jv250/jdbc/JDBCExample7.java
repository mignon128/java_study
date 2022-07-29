package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample7 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs=null;
		
		try {
			Class.forName(driver);
			System.out.println("LOADED DRIVER ----> " + driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			String sql = "SELECT * FROM Customer";
			try {
			con = DriverManager.getConnection(url, id, passwd);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("CONNECTED TO ----> " + url); // SQL을 전달하기 위해서(문자열로)
			while (rs.next()) {
				long cid = rs.getLong("cid");
				String customerId = rs.getString("customerId"); // String customerId의 customerId는 자바
				String name = rs.getString("name");
				String phone = rs.getString("phone");

				System.out.println(cid);
				System.out.println(customerId);
				System.out.println(name);
				System.out.println(phone);
				System.out.println("----------------------------------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
