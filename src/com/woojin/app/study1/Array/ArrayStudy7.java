package com.woojin.app.study1.Array;

public class ArrayStudy7 {

	public static void main(String[] args) {
		//배열
		//같은 데이터 타입을 모을
		//모을 개수를 미리 선언, 길이 수정x
		//모으려고 하는 데이터타입 변수명
		int [] ar1 = {1,2,3};
		int [] ar2 = {5,6,7};
		
		int [][] ars = {ar1, ar2};
		ars = new int [2][2];
		ars[0] = ar1;
		ars[1] = ar2;
		
		System.out.println(ars.length);
		for (int i=0; i<ars.length; i++) {
			//ars[0] == ar1
			//ars[1] == ar2
			for (int j=0; j<ars[i].length; j++) {
				System.out.println(ars[i][j]);
				
			}
		}
		//가변배열
		ars = new int [2][];
		ars[0] = new int [3];
		ars[1] = new int [2];
	}

}
