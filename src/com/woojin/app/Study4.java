package com.woojin.app;

public class Study4 {
	
	/**
	 * 형변환 (Cascading, 데이터타입의 변환)
	 * (변환할 타입명 기술) 
	 * 
	 * Primitive Type끼리만 가능. 단, boolean 제외
	 * 
	 * 1. 자동 변환
	 * 	  값의 변화가 없음
	 *    byte - short(char) - int - long - float - double
	 * 2. 강제 변환
	 *    값의 변화가 있을 수 있음
	 *    double - float - long - int - short(char) - byte
	 *    
	 */
	public static void main(String[] args) {
		
		char ch = 'b';
		int num = ch;
		
		num = 99;
		
		ch = (char)num; 
		
		System.out.println(num);
		System.out.println(ch);
		
		double d = 23.56;
		num = (int)d;
		System.out.println(num);
		
		num = 5;
		d = num;
		System.out.println(d);
		
		long n1 = 0L;
		float f1 = 0.0f;
		
		n1 = (int)f1;
		
	}
}
