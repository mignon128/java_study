package com.varxyz.jvx330.di.example1;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		String config = "com/varxyz/jvx330/di/example1/beans.xml";
		GenericApplicationContext context = new GenericXmlApplicationContext(config);
		
		Foo foo = context.getBean("foo", Foo.class); // Foo(bar) constructor is called
		System.out.println(foo);
		
		Foo foo2 = context.getBean("foo", Foo.class); // Foo() constructor is called / setBar() is called
		System.out.println(foo2); // hash가 같다는 말 = 동일 객체
		context.close();			
	}	
}
