package cn.com.zjf.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.zjf.model.User;

public class T1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		/*
		User xiaofen=ac.getBean("xiaofen",User.class);
		System.out.println(xiaofen);
		*/
		/*
		User xiaoming=ac.getBean("xiaoming",User.class);
		System.out.println(xiaoming);
		*/
		User xiaogang=ac.getBean("xiaogang",User.class);
		System.out.println(xiaogang);
		ac.close();
	}
}
