package cn.com.zjf.model;


/*
 * 1.copy Jar��(6��)
 * 2.����spring�������ļ�
 * 3.����&ʵ����IOC����
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
