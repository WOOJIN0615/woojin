package com.woojin.app;

import java.util.Scanner;

public class Study5 {
	/**
	 * 연산자 
	 * 산술연산자 - 숫자 계산
	 * +, -, *, /, %(나머지값 구하는 연산자)
	 * 
	 * + : 1) 산술연산자
	 * 	
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 50;
		int num2 = num1 + 20;
		num2 = (int)(num1 + 1.2);
		
		System.out.println("국어 점수를 입력하세요");
		double n1 = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		double n2 = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		double n3 = sc.nextInt();
		
		double grade = (n1 + n2 + n3) / 3;
		
		System.out.println("평균 점수는" + " " + grade + "점" + " " + "입니다");
		
		
		System.out.println("프로그램이 종료되었습니다.");
		
	}
}
