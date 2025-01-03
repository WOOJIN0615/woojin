package com.woojin.app.Himart;

public class Tv extends Machine {
	private int k;
	private int inch;
	
	public Tv() {
		this.setPrice(600);
		this.setPoint(60);
		this.setBrand("LG");
		this.setK(8);
		this.setInch(80);
	}
	
	public void info() {
		super.info();
		System.out.println(this.k);
		System.out.println(this.inch);
	}
	
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	
	
	
}
