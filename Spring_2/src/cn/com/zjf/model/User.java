package cn.com.zjf.model;

public class User {
	private Integer id;
	private String name;
	private Car car;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", car=" + car + "]";
	}
	
}
