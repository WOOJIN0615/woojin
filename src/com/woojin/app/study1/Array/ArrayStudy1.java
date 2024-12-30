package com.woojin.app.study1.Array;

import java.util.Scanner;

public class ArrayStudy1 {
	public static void main(String[] args) {
		//변수 선언 공식 - > 데이터타입 변수명;
		// 
		int [] nums = new int [4];
		double [] avgs = new double [3];

		//사람 3명의 이름을 모을 배열
		String [] names = new String [4];
		
		names[0] = "woojin";
		names[1] = "moonheon";
		names[2] = "daegivv";
		names[3] = "minsu";
		
		
		avgs[1] = 3.12;
		System.out.println(names[0]);
		System.out.println(avgs[0]);
		
//		for(int i = 0; i<10000; i++) {
//			System.out.println(names[i]);
//		}
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<nums.length; i++) {
			System.out.println("숫자를 입력하세요");
			nums[0] = sc.nextInt();
		}
		//nums를 출력
		for(int i=0; i<nums.length ; i++) {
			System.out.println(nums[i]);
		}


	}

}
