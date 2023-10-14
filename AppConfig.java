package ru.Andrey.spring_app0;

@Configuration

public class AppConfig {
	
	@Bean
	
	public HelloBean helloBean() {
		return new HelloBean("Hello, World!");
		
	}

}
