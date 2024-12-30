package com.woojin.app;

public class Study11 {
	
	/**
	 * 삼항연산자
	 * 조건식은 결과물이 boolean
	 * 변수 = 조건식?
	 * 
	 */
	public static void main(String[] args) {
		
		//나이를 입력받아서 미성년자 구분
		int age = 22;
		
		//String result = age > 19?"성년":"미성년";
		
		//System.out.println(result);
		
		int price = 20000;
		//물건의 가격이 30000원 이상 구매시 배달료 무료, 아니라면 2500원의 배달료
		
		int result = price >= 30000?0:+2500;
		
		int all = result + price;
		
		System.out.println(all);
		
	}

}
