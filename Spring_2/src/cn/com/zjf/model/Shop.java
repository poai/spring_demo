package cn.com.zjf.model;

import java.util.List;

public class Shop {
	private Integer id;
	private String name;
	private List<Car> cars;
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
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	public Shop() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", cars=" + cars + "]";
	}
	
}
