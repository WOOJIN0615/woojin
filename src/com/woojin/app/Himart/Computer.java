package com.woojin.app.Himart;

public class Computer extends Machine {
	private String CPU;
	public Computer() {
		this.setPrice(200);
		this.setPoint(20);
		this.setBrand("삼성");
		this.setCPU("Intel I9");
	}
	
	public void info() {
		super.info();
		System.out.println(this.CPU);
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}
	
	
}
