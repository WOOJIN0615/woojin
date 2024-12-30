package com.woojin.app.controls;

import java.util.Scanner;

public class StudyControl4 {
	public static void main(String[] args) {
		/**
		 * 여러 개 중 하나 선택
		 * switch case
		 * 
		 * switch(정수식 또는 문자열){
		 * 		case 정수 또는 문자열:
		 * 		break;	
		 * 
		 * 		case 정수 또는 문자열:
		 * 		break;
		 * 
		 * 		case 정수 또는 문자열:
		 * 		break;
		 * 		...
		 * 
		 * 		default:
		 * 
		 * }
		 */
		int avg = 75;
		String A = "";
		switch (avg / 10) {
		case 10:
		case 9:
			A = "A";
			break;
		case 8: 
			A = "B";
			break;
		case 7: 
			A = "C";
			break;
		case 6: 
			A = "D";
			break;
			
			default:
				A = "F";
		}
		System.out.println(A);
	}
}
