package com.varxyz.jvx330.lifecycle.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.varxyz.jvx330.lifecycle.AppConfig;

// 빈을 여러개 일 때 count가 1이면 증명됨
public class Goat {
	private static int count;

	public Goat() {
		count++;
	}

	public static int getCount() {
		return count;
	}

	public static void main(String[] args) {
		GenericApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		context.getBean("goat", Goat.class);
		context.getBean("goat", Goat.class);
		context.getBean("goat", Goat.class);
		System.out.println("goat's final count : " + Goat.getCount());
		context.close();
	}
}