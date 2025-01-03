 package com.woojin.app.Himart;

public class Washer extends Machine {
	private int volume;
	private String thing;
	
	public Washer() {
		this.setPrice(100);
		this.setPoint(10);
		this.setBrand("Daewoo");
		this.setVolume(20);
		this.setThing("통돌이");
	}
	
	public void info() {
		super.info();
		System.out.println(this.volume);
		System.out.println(this.thing);
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getThing() {
		return thing;
	}
	public void setThing(String thing) {
		this.thing = thing;
	}
	
	
}
