package com.woojin.app.study1.Array;

import java.util.Scanner;

public class ArrayStudy2 {
	public static void main(String[] args) {
		//한 반에서 국어시험의 결과를 저장
		//학생 수는 n명
		//학생 수를 입력 받아서 시작
		//국어의 총점과 평균을 계산
		double total = 0;
		double avgs = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int n = sc.nextInt();

		int[] scores = new int[n];
		for(int i=0; i<scores.length; i++) {
			scores[i] = sc.nextInt();
			
		}
		for (int i=0; i<scores.length; i++) {
			total = total + scores[i];
			avgs = total / scores.length;
		}
		
		System.out.println("총점은 " + total + " 입니다.");
		System.out.println("평균은 " + avgs + " 입니다.");
		
	}
}
