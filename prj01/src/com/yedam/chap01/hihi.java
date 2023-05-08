package com.yedam.chap01;


public class hihi {

	public static void main(String[] args) {
		System.out.println("hello world");
	//char타입은 유니코드로 변환되어 저장됨
		
		int var1=0b011;
		int var2=0206;//8진수
		int var3=365;
		int var4=0xB3;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);

		char c3='\uac00';
		char c5=44032;
		char c6='가';
		System.out.println(c3);
		System.out.println(c5);
		System.out.println(c6);
		
		//\t tab만큼 띄우기
		//\\특수문자사용(\)
		//\"특수문자 사용(")
		
		
	}

}
