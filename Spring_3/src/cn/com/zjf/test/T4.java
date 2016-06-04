package cn.com.zjf.test;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.zjf.model.Car;

public class T4 {
	public static void main(String[] args) throws SQLException {
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans_3.xml");
		Car car=ac.getBean("baoma",Car.class);
		System.out.println(car);
		ac.destroy();
		//ac.refresh();
		ac.close();
	}
}
