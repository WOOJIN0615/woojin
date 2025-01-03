package com.woojin.app.Study2.modifier;

public class ModMain {
	public static void main(String[] args) {
		Test test = new Test();
		test.num1 = 30;
		Test.num3 = 1010;
		System.out.println(Test.num3);
		System.out.println(test.num1);
		
		Test test2 = new Test();
		System.out.println("=============================");
		System.out.println(Test.num3);
		System.out.println(test2.num1);		
//		test.m1();
//		
//		Test2.num2 = 200;
//		Test2.m2();
		
		System.out.println("=============================");
		Test3 t3 = Test3.getInstance();
		t3.getName();
		t3.setName("");
		
	}	
}
