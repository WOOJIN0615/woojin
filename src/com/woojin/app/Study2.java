package com.woojin.app;

public class Study2 {
	/**
	 * DataType과 변수
	 * 
	 * 변수 : 하나의 값을 저장하는 메모리상의 공간
	 * 		 변하는 값
	 * 
	 * 상수 : 변하지 않는 값
	 * 리터럴 : 변수에 대입하는 상수 데이터
	 * 
	 * Datatype
	 * 	
	 * Primitive type (원시타입, 기본타입) *더 이상 분리할 수 없는 타입
	 * 	
	 *  숫자 
	 *  	정수 1) byte		: 1byte  -128 ~ 127		주로 BIT 
	 *  		2) short	: 2byte  -32768 ~ 32767	C언어 호환
	 *  		3) int 		: 4byte  -21억 ~ 21억		
	 *  		4) long 	: 8byte  
	 *  	
	 *  	실수 1) float 	: 4byte   소숫점 7자리   
	 *  		2) double 	: 8byte	  소숫점 15자리	
	 *  
	 *  	문자 1) char : 2byte
	 *  	리터럴 앞뒤로 ''로 감싸야 함
	 *  
	 *  	논리 1) boolean  : 1byte
	 *  	값은 true, false
	 *  
	 * 그 외 나머지 Reference type (참조타입)
	 * 		
	 * 	   문자열	1) String	
	 * 		리터럴 앞 뒤로 ""로 감싸야 함 
	 */
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//변수 선언(사용) 문법
		//데이터타입 변수명(첫글자는 소문자)
		int money; //운영체제에게 메모리에 4byte를 확보
		//초기화 : 선언된 변수에 최초로 값을 대입하는 것
		money = 500;
		
		
		System.out.println(money);
		
		//변수 선언과 동시에 초기화
		long members = 500L;
		
		//
		double jumsu = 4.44;
		float jumsu2  = 4.44F;
		
		//사용 변수명만 명시. 데이터타입 제외
		money = 700;
		money = money + 200;
		System.out.println(money);
		
		//char
		char ch = 'a';
		ch = '1';
		
		boolean flag = true;
		flag = false;
		
		String name = "아이유";
		System.out.println(name);
	}
}
