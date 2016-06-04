package cn.com.zjf.model;

import org.springframework.stereotype.Repository;

@Repository("hello")
public class Hello {

	public String toMessage(String message) {
		System.out.println(message);
		return "hello";
	}

	public void add(int a, float b) {

	}

	public void add(int a, int b) {

		
	}

	public void add(int a, double b) {

	}
}
