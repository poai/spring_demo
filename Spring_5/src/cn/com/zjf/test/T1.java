package cn.com.zjf.test;

import cn.com.zjf.model.Hello;

/*
 * ΪHello.java�е����еķ������һ����־�Ĺ���
 * */
public class T1 {
	public static void main(String[] args) {
		
		Hello hello=new Hello();
		//System.out.println("before toMessage");
		try{
			System.out.println("ǰ��֪ͨ");
			hello.toMessage("Hello World!!");
			System.out.println("����֪ͨ");
			return ;
		}catch(Exception e){
			System.out.println("�쳣֪ͨ");
		}finally{
			System.out.println("����֪ͨ");
		}
		
		//System.out.println("after toMessage");
		
	}
}
