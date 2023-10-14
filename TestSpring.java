package ru.Andrey.spring_app0;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
 

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloBean helloBean = context.getBean(HelloBean.class);
	
		System.out.println(helloBean.getMessage());
	}

}
