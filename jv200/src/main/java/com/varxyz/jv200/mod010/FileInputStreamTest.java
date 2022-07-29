package com.varxyz.jv200.mod010;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int totalByes = 0; // 읽은 byte의 수
		try {
			try {
				fis = new FileInputStream("test.txt"); // 상대주소 / 절대주소: /가 앞에 있어야함
				fos = new FileOutputStream("test_copy.txt");
				for (int readByte; (readByte = fis.read()) != -1;) {// fis.read()를 readByte에 넣고 읽어서 -1이 아닐때까지
					fos.write(readByte);
					totalByes++;
				}
			} finally {
				fos.close();
				fis.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n전체 바이트 수: " + totalByes + " bytes."); //'12345ABCDE가나다라마'가 27byte인 이유: 인코딩
	}
}
