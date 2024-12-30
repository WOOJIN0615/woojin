package com.woojin.app;

import java.util.Scanner;

public class Study9 {
	/**
	 * 비교 연산자(관계 연산자)
	 * 결과물은 boolean
	 * a>b, a<b, a>=b, a<=b, a==b, a!=b
	 * 
	 * ==, != primitive type OK, Reference type UnSafe
	 * 
	 * 
	 * 논리연산자
	 * boolean type끼리 연산 : 결과물은 boolean type
	 * && : and 연산자
	 * || :  or 연산자
	 * !  : 부정 연산자
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 30;
		int b = 20;
		boolean result = a < b;
		System.out.println(result);
		
		b = 20;
		System.out.println(a==b);
		
		String name = "iu";
		String name2 = "iu";
		System.out.println(name==name2);
		
		System.out.println("이름 입력");
		String name3 = sc.next();
		System.out.println(name==name3);
		
	}

}
