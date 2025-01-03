package com.woojin.app.Zoo;

//추상 클래스
public abstract class Animal {
	private String name;
	private int age;
	
	public final void info() {
		System.out.println("final");
	}//상속 가능, overriding 불가
	
	//추상 메서드
	public abstract void eat();
	
	public abstract void sleep();
	public abstract void play();
	
	public abstract void poo();

}
