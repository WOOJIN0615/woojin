package com.woojin.app.controls;

import java.util.Scanner;

public class StudyLoop2 {
	public static void main(String[] args) {
		//for(초기식; 조건식; 증감식) {}
		//0초 ~ 59초
		Scanner sc = new Scanner(System.in);
//		System.out.println("초를 입력하세요.");
//		int sec = sc.nextInt();
//		int i = 0;
//		
//		for (i=0;i<60;i++) {
//			System.out.println(i+"초");
//			if (i == sec) {
//				i = 61;//설정한 sec의 값에 도달했을때 멈추게 하려면 i의 값을 강제로 조건식에 맞지 않게 설정함.
//			}//if
//			
//		}//for
		int id = 1234;
		int pw = 5678;
		boolean check = false;
		
		
		for (int i=0; i<5; i=i+1) {
			System.out.println("아이디 입력");
			int ID = sc.nextInt();
			System.out.println("비밀번호 입력");
			int PW = sc.nextInt();
			if (id == ID && pw == PW) {
				i = 5;
				check = true;
				System.out.println("로그인 성공");
				break;
			}//id, pw를 올바르게 입력하여 바로 for문이 종료될때
			else if (i<4) {
				System.out.println("아이디 또는 비밀번호가 틀렸습니다");
				check = false;
			}//if문을 거치지 않았을때, 그리고 시행 횟수가 4회 미만일때
			else {
				System.out.println("계정이 잠겼습니다.");
			}//else if문을 거치지 않았을때, 그리고 시행횟수가 5회일때
			
		 
		}
		
	}//main
	
}//class
