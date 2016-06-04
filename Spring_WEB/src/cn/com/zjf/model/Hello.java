package cn.com.zjf.model;

import org.springframework.stereotype.Repository;

@Repository
public class Hello {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void hello(){
		System.out.println(message);
	}
}
