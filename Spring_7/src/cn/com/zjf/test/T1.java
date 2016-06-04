package cn.com.zjf.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.zjf.model.User;
import cn.com.zjf.service.UserService;

public class T1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		/*���һ��User����*/
		UserService userService=ac.getBean("userService",UserService.class);
		User user=ac.getBean("user",User.class);
		user.setName("С��");
		userService.add(user);
		ac.close();
	}
	
	
}
