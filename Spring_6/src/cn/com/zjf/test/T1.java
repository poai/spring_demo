package cn.com.zjf.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.zjf.model.Hello;

public class T1 {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans_1.xml");
		Hello hello=ac.getBean("hello",Hello.class);
		hello.add(100, 10);
		ac.close();
		
	}
}
