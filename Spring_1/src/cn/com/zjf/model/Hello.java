package cn.com.zjf.model;


/*
 * 1.copy Jar包(6个)
 * 2.创建spring的配置文件
 * 3.创建&实例化IOC容器
 * */
public class Hello {
	
	
	public Hello() {
		System.out.println("Hello_construct");
	}
	
	private String message;

	public String getMessage() {
		System.out.println("getMessage");
		return message;
	}

	public void setMessage(String message) {
		System.out.println("setMessage");
		this.message = message;
	}
	
	public void toMessage(){
		
		System.out.println(this.getMessage());
	}
}
