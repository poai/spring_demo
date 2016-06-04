package cn.com.zjf.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.zjf.model.Hello;


/*
 * 1.��IOC����ʵ������ʱ���ʵ����Bean������ͨ������setXXXΪ���Ը�ֵ
 * 2.IOC�����е�BeanĬ��Ϊ����
 * */
public class T1 {

	public static void main(String[] args) {
		
		/*1.��ȡSpring ��IOC����*/
		System.out.println("start");
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		/*2.�������л�ȡBean����*/
		
		Hello hello=context.getBean("hello", Hello.class);
		Hello hello1=context.getBean("hello", Hello.class);
		
		/*3.ʹ��Bean����*/
		
		hello.toMessage();
		hello1.toMessage();
		context.close();
	}
}
