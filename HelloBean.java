package ru.Andrey.spring_app0;

public class HelloBean {
	private String message;
	
	public HelloBean(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
		
	}

}
