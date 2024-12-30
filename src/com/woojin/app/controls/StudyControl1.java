package com.woojin.app.controls;

import java.util.Scanner;

public class StudyControl1 {
	/**
	 * 제어문
	 * 
	 * 1) 단일 if
	 * 
	 * 	  if(조건식){
	 * 		조건식이 true일때만 실행
	 * }
	 */
	
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		
		//int num = 10004;
		
		//if(num % 2 == 0) {
		//	System.out.println("Num : " + num);
		//}
		
		//System.out.println("프로그램 종료");
		
		Scanner sc = new Scanner(System.in);
		//국어, 영어, 수학 점수를 입력 받아서
		//총점과 평균 계산후 90점 이상 - 우수상 수상 출력
		//아니면 프로그램 종료
		System.out.println("국어 점수를 입력하세요");
		int KOR = sc.nextInt();
		if(KOR>100||KOR<0) {
			System.out.println("ERROR!");
		}
		else
			System.out.println("수학 점수를 입력하세요");
		int MATH = sc.nextInt();
		if(MATH>100||MATH<0) {
			System.out.println("ERROR!");
		}
		else
			System.out.println("영어 점수를 입력하세요");
		int ENG = sc.nextInt();
		if(ENG>100||ENG<0) {
			System.out.println("ERROR!");
		}
		int score = KOR + MATH + ENG;
		double avg = (score / 3);
		System.out.println("평균은 " + avg + "점" + " " + "입니다");
		
		if(avg >= 60) {
			System.out.println("통과");
			if(avg >= 90) {
				System.out.println("우수상 수상");
			}
		}
		else
			System.out.println("점수 미달");
		if(avg>=90) {
			System.out.println("A학점");
		}
		if(avg>=80 && avg<90) {
			System.out.println("B학점");
		}
		if(avg>=70 && avg<80) {
			System.out.println("C학점");
		}
		if(avg>=60 && avg<70) {
			System.out.println("D학점");
		}
		if(avg<60) {
			System.out.println("F학점");
		}
		
		
		System.out.println("프로그램 종료");
	}

}
