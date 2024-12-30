package com.woojin.app.controls;

import java.util.Scanner;

public class StudyControl2 {
	public static void main(String[] args) {
		//sysout + crtl + space
		/**
		 * if ~ else 양자택일하여 실행
		 * if (조건식){
		 * 		조건식이 true일 때만 실행
		 * }
		 * else {
		 * 		조건식이 false일 때 실행
		 * }
		 */
		//int num = -5;
		//int age = 0;
		//if(num>0) {
	//		num++;
	//		age = 20;//지역변수(중괄호 내에 선언된 변수)
	//		age++;
//		}
//		else {
//			System.out.println("음수 입니다.");
//		}
		
//		System.out.println(num);
//		System.out.println(age); 
		
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw = 5678;
		
		System.out.println("아이디를 입력하세요.");
		int id1 = sc.nextInt();
		if (id != id1) {
			System.out.println("가입되지 않은 아이디입니다.");
		}
		else {
			System.out.println("비밀번호를 입력하세요.");
		}
		int pw1 = sc.nextInt();
		if (pw != pw1) {
			System.out.println("옳지 않은 비밀번호입니다.");
		}
		else {
			System.out.println("환영합니다!");
		}
	}

}
