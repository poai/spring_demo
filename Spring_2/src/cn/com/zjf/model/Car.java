package cn.com.zjf.model;

public class Car {
	private Integer id;
	private String name;
	private Float price;
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
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	public Car() {
		
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public Car(Integer id, String name, Float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	
}
