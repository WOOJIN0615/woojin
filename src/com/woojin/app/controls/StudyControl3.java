package com.woojin.app.controls;

import java.util.Scanner;

public class StudyControl3 {
	public static void main(String[] args) {
		/**
		 * 여러개 중 하나를 선택
		 * if(조건식1) {
		 * 		조건식1이 true일 때 실행
		 * }else if(조건식2) {
		 * 		조건식2가 true일 때 실행
		 * }else if(조건식3) {
		 * 		조건식3이 true일 때 실행
		 * }
		 * ....
		 * else {
		 * 		그 외 나머지
		 */
		int avg = 76;
		String result = "";
		if(avg>90) {
			result="A";
		}else if(avg>=80) {
			result="B";
		}else if(avg>=70) {
			result="C";
		}else if(avg>=60) {
			result="D";
		}else {
			result="F";
		}
		System.out.println(result);
	}

}
