package com.woojin.app;

public class Study10 {
	/**
	 * 증감연산자
	 * 1씩 증가/감소 시킬때 사용하는 연산자
	 * ++
	 * 
	 * --
	 * 
	 * 
	 * 1. 선행
	 * ++변수명
	 * 
	 * 2. 후행
	 * 변수명++
	 * 
	 * 확장된 대입 연산자
	 * num = num + 3;
	 * num += 3;
	 * 
	 * num = num/5;
	 * num /= 5;
	 * 
	 * num = n+5; 불가능
	 * 
	 */
	public static void main(String[] args) {
		int num = 0;
		
		num = num + 1;
		
		++num; //num = num + 1
		
		num++; //num = num + 1 
		
		--num;
		
		num--;
		
		num = 1;
		
		int result = ++num; //2, 2
		
		result = num++ +1;
		System.out.println(num);
		System.out.println(result);
		
	}

}
