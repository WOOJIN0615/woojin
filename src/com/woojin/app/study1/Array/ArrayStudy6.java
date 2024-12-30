package com.woojin.app.study1.Array;

import java.sql.Wrapper;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayStudy6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생 수를 입력받음
		//학생 수 만큼 학생 이름을 입력받고 출력
		System.out.println("학생 수를 입력하세요.");
		int n = sc.nextInt();
		int [] score = new int[n];
		int [] math = new int[n];
		int [] all = new int[n];
		String [] name = new String[n];
		String [] result = new String[n];
		result[n] = name[n] + score[n] + math[n] + all[n]; 
		for (int i=0; i<n; i++) {
			System.out.println("학생의 이름을 입력하세요.");
			name[i]=sc.next();
		}
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]+"의  국어 점수 입력");
			score[i]=sc.nextInt();
			System.out.println(name[i]+"의 수학 점수 입력");
			math[i]=sc.nextInt();
			all[i]=math[i]+score[i];
		}
		//총점 기준으로 내림차순 정렬
		for (int i=0; i<all.length; i++) {
			for (int j=i+1; j<all.length; j++) {
				if (all[i] < all[j]) {
					int tmp = all[i];
					all[i] = all[j];
					all[j] = tmp;
				}
			}
		}
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]+" : " + score[i]+" : " + math[i] + " : " + all[i]);
		}
		}
		//학생 수 만큼 국어점수 입력
		//입력한 이름의 국어점수 입력
		
		

	}


