package com.woojin.app.units;

public class Pet {
	
	private String name;
	private int power;
	private int mp;

	public Pet() {
		this.name="콩콩이";
		this.power=2;
		this.mp=5;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(power);
		System.out.println(mp);
		System.out.println("================================");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	
}