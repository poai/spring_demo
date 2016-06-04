package cn.com.zjf.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.zjf.model.Car;
import cn.com.zjf.model.User;

public class T2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans_1.xml");
		
		User user=ac.getBean("xiaofen",User.class);
		System.out.println(user);
		Car ca1=ac.getBean("baoma",Car.class);
		Car ca2=ac.getBean("baoma",Car.class);
		
		System.out.println(ca1.hashCode());
		System.out.println(ca2.hashCode());
		ac.close();
	}
}
