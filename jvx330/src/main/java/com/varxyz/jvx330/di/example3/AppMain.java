package com.varxyz.jvx330.di.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		//String config = "com/varxyz/jvx330/di/example3/beans.xml";
		GenericApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MemberService service = context.getBean("memberService",MemberService.class);
		service.getAllMember().forEach(member -> System.out.println(member));
		
//		System.out.println(service.getAllMember());
		
//		List<Member> list = service.getAllMember();
//		for(Member member : list) {
//			System.out.println(member);
//		}
		context.close();
	}
}
