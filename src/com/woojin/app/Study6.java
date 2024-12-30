package com.woojin.app;

import java.util.Scanner;

public class Study6 {
	public static void main(String[] args) {
		//나머지 연산자 %
		Scanner sc = new Scanner(System.in);
		//편의점 자동 계산 프로그램
		//물건의 총 합계금액 입력
		//25300
		//지불금액 50000
		//거스름돈 24700
		//만원 2장, 천원 4장, 백원 7개
		
		int sum = 25300;
		int don = 50000;
		int jandon = don - sum; //24700
		
		System.out.println("총액을 입력하세요");
		int n1 = sc.nextInt();
		System.out.println("지불 금액을 입력하세요");
		int n2 = sc.nextInt();
		
		//int n1 - n2;
		
		int m = jandon/10000; //만원짜리 개수
		int d = jandon%10000; //만원단위
		int c = d/1000; //거스름돈에서 만원단위를 뺌
		int a = jandon%1000; //천원짜리 개수
		int e = a/100; //천원단위
		System.out.println("거스름돈은" + " " + "만원짜리" + " " + m + "장" + " " +  "천원" +  " " + c + "장" + " " + "백원" + " " + e + "개입니다");
		
	}
}
