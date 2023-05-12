package oop;

public class Computer {
	//field
	
	//constructor
	
	//method
	//매개변수의 갯수를 모르는 경우--1배열활용
	int sum1(int[]values) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}return sum;
	}
	//파라미터가 몇개인지 몰?루?--2목록을 넘겨주는 방식
	int sum2(int ...values) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}return sum;
	}
}
