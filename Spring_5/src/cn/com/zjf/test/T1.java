package cn.com.zjf.test;

import cn.com.zjf.model.Hello;

/*
 * 为Hello.java中的所有的方法添加一个日志的功能
 * */
public class T1 {
	public static void main(String[] args) {
		
		Hello hello=new Hello();
		//System.out.println("before toMessage");
		try{
			System.out.println("前置通知");
			hello.toMessage("Hello World!!");
			System.out.println("返回通知");
			return ;
		}catch(Exception e){
			System.out.println("异常通知");
		}finally{
			System.out.println("后置通知");
		}
		
		//System.out.println("after toMessage");
		
	}
}
