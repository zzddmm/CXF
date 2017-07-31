package com.atguigu.day01_ws.bean;

public class Student {
	public Student(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	private int id;
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", price=" + price + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
