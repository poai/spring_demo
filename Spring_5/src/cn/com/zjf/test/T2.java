package cn.com.zjf.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.zjf.model.Hello;
import cn.com.zjf.model.User;

/*
 * ΪHello.java�е����еķ������һ����־�Ĺ���
 * */
public class T2 {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Hello hello=ac.getBean("hello",Hello.class);
		hello.toMessage("Hello World!");
		hello.add(100, 200);
		User user=ac.getBean("user",User.class);
		user.setName("xiaofen");
		ac.close();
	}
}
