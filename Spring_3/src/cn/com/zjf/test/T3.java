package cn.com.zjf.test;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import cn.com.zjf.model.User;

public class T3 {
	public static void main(String[] args) throws SQLException {
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans_2.xml");
		
		User user=ac.getBean("xiaofen",User.class);
		System.out.println(user);
		ComboPooledDataSource dataSource=ac.getBean("dataSource",ComboPooledDataSource.class);
		dataSource.getConnection().createStatement().execute("create table table1(name varchar(255))");
		System.out.println(dataSource);
		ac.close();
	}
}
