package cn.com.zjf.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.zjf.model.Car;
import cn.com.zjf.model.Shop;
import cn.com.zjf.model.User;

public class T1 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Car baoma=ac.getBean("baoma", Car.class);
		System.out.println(baoma);
		User xiaofen=ac.getBean("xiaofen", User.class);
		System.out.println(xiaofen);
		Shop shop1=ac.getBean("shop1",Shop.class);
		System.out.println(shop1);
		Car dazhong=ac.getBean("dazhong",Car.class);
		System.out.println(dazhong);
		Car daben=ac.getBean("daben", Car.class);
		System.out.println(daben);
		Car qq=ac.getBean("QQ",Car.class);
		System.out.println(qq);
		ac.close();
	}
	
}
