package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCExAccount2 {
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

			String sql = "UPDATE Account SET accountNum = ?,  balance = ? WHERE aid = ?";
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, "222-11-1123");
			stmt.setDouble(2, 2000.0);
			stmt.setLong(3, 3004);
			stmt.executeUpdate();
			
			System.out.println("UPDATED....");
			stmt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}