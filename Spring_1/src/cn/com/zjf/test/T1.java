package cn.com.zjf.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.zjf.model.Hello;


/*
 * 1.当IOC容器实例化的时候会实例化Bean对象并且通过调用setXXX为属性赋值
 * 2.IOC容器中的Bean默认为单例
 * */
public class T1 {

	public static void main(String[] args) {
		
		/*1.获取Spring 的IOC容器*/
		System.out.println("start");
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		/*2.从容器中获取Bean对象*/
		
		Hello hello=context.getBean("hello", Hello.class);
		Hello hello1=context.getBean("hello", Hello.class);
		
		/*3.使用Bean对象*/
		
		hello.toMessage();
		hello1.toMessage();
		context.close();
	}
}
