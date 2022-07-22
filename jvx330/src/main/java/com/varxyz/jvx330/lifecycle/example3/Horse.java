package com.varxyz.jvx330.lifecycle.example3;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.varxyz.jvx330.lifecycle.AppConfig;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Horse implements InitializingBean, DisposableBean{
	
	@PostConstruct
	public void initMenuData() {
		
	}
	
	private static int count;
	
	public Horse() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy 호출");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet 호출");
		
	}
	public static void main(String[] args) {
		GenericApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		context.getBean("horse", Horse.class);
		context.getBean("horse", Horse.class);
		context.getBean("horse", Horse.class);
		System.out.println("horse's count : " + Horse.getCount());
		context.close();
	}
}