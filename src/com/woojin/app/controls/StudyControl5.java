package com.woojin.app.controls;

import java.util.Random;
import java.util.Scanner;

public class StudyControl5 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int salt = random.nextInt(8)+1; // 0~8미만의 정수 하나를 무작위로 뽑는다.
		int ch = random.nextInt(26)+97; // 97 ~ 122
		char word = (char)ch;
		System.out.println(salt);
		System.out.println(word);
		
		int a = salt + ch;
		char b = (char)a;
		if (a>122) {
			int c = a - 26;
			char d = (char)c;
			System.out.println(d);
		}
		else {
			System.out.println(b);
		}
		System.out.println(a);
		
	}
}
