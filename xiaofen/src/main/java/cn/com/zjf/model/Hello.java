package cn.com.zjf.model;

import org.springframework.stereotype.Repository;

@Repository
public class Hello {

	private Integer id;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void hello(){
		System.out.println(message);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Hello [id=" + id + ", message=" + message + "]";
	}
	
}
