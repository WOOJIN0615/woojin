package com.woojin.app.study1.Array;

public class ArrayStudy3 {

	public static void main(String[] args) {
		//정수 2개를 모을 배열 선언
		//모으려고 하는 데이터타입 [] 변수명
		//한번 선언된 배열의 크기는 변경이 불가
		
		int [] nums = {10, 20};
		int ar [] = new int [3];
		
		//얕은 복사
		ar = nums;
		
		nums[0] = 8;
		System.out.println(ar[0]);
		
		//깊은 복사
		int [] copy = new int [nums.length+1];
		
		for(int i=0; i<nums.length;i++) {
			copy[i]=nums[i];
		}
//		copy[0]=nums[0];
//		copy[1]=nums[1];
		copy[2]=30;
		
		copy[0] = 50;
		System.out.println(nums[0]);
		

	}

}
