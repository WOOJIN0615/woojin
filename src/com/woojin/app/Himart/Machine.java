package com.woojin.app.Himart;

public abstract class Machine implements Electronic {
	
	private int price;
	private String brand;
	private int point;
	
	public void info() {
		System.out.println(this.price);
		System.out.println(this.point);
		System.out.println(this.brand);
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public void electro() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void pushbutton() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
