package com.woojin.app.controls;

import java.util.Scanner;

public class StudyLoop1 {
	public static void main(String[] args) {
		/**
		 * 반복작업
		 * 1. for 2. while
		 * 
		 * 1. for ~동안
		 * 		for (초기식; 조건식; 증감식) {
		 * 		  조건식이 true일때 실행
		 * 		}
		 * 	1) 초기식 진행
		 *  2) 조건식 진행 
		 *  	true라면 {} 실행
		 *  	  증감식 실행
		 *  	  조건식 진행
		 *  	false라면 for문 종료
		 * 
		 */
		for(int i=0; i<10; i++) {
			//0-9 짝수만 출력
			if (i%2==0) {
			//System.out.println(i+"hello");
			}
			
			
		}
		//i=i+1 > i++, i=i+2
		for(int i=0; i<10; i=i+2) {
			//System.out.println(i);
		}
		
		int count = 6  ;
		//누적함수
		// 0+1+2+3+4+5 = 15
		// sum = sum+?
		int sum = 0;
		for (int i=0; i<count; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		
	}
}
