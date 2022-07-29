package com.varxyz.jvx330.di.example6;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MenuTest {
	public static void main(String[] args) {
		String config = "com/varxyz/jvx330/di/example6/beans.xml";
		GenericApplicationContext context = new GenericXmlApplicationContext(config);

		MenuItemController controller = context.getBean("menuItemController", MenuItemController.class);
		controller.addMenu("아메리카노", 4000.0);
		controller.addMenu("카페라떼", 5000.0);
		controller.getAllMenu();
		controller.serchMenuName("아메리카노");
		context.close();
	}
}
