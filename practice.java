package com.yedam.chap01;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
//		int x = -5;
//		int y = 10;
//		int result;
//		
//		System.out.printf("x : %d, result : %d\n", x, -x);
//		
//		
//		
//		System.out.printf("x : %d, y : %d, result : %d\n", ++x, x+y, --y);
//		
//		
//		System.out.printf("x : %d, y : %d, result : %d\n", x, y, x+y);
//		
//		
//		int m = 10;
//		int n = 5;
//		
//		
//		System.out.println( ( m*2 == n*4 ) && ( n<=5 ) );		
//		System.out.println( ( m/2 > 5) || ( n%2 < 1) );
//		
//		
//		int val = 0;
//
//		val+=10;
//			
//		val-= 5;		
//		
//		val*=3;
//				
//		val /=5;
//		
//		
//		// 문제4) 변수 val의 값이 양수일 경우엔 변수 값을, 아닐 경우엔 0을 담는 변수를 선언하세요. (단, 삼항연산자를 사용)
//		
//		int intResult=val>=0?val:0;
//				System.out.println(intResult);
//				
//				/* 문제 5) 다음과 같이 두 개의 정수가 주어졌을 경우 
//			  			    두 정 수 중에서 음수가 있다면 'One of a or b is negative number'를,
//			  			    만일 그렇지 않다면 'both a and b are zero or more'를 출력하도록 구현하세요. */ 
//				int a = 10;
//				int b = -8;
//				String strResult;
//				
//				if(a>=0&&b>=0) {
//					strResult="both a and b are zero or more";
//				}
//				else {
//					strResult="One of a or b is negative number";
//				}
//				System.out.println(strResult);
//				
//				
//				
//				
//				
//				
//				
//				Scanner scs=new Scanner(System.in);
//				System.out.println("enter your score");
//
//				int score=Integer.parseInt(scs.nextLine());
//				String grade="";
//				
//				//f3은 api보기
//
//				
//				
//			
//				
//				switch(score/10) {
//				case 9: if(score>=95) {System.out.println("A+");}
//							else {System.out.println("A");}
//				break;
//				
//				case 8: if(score>=85) {System.out.println("B+");}
//				else {System.out.println("B");}
//				break;
//				
//				case 7: if(score>=75) {System.out.println("C+");}
//				else {System.out.println("C");}
//				break;
//				
//				default: System.out.println("D");
//				break;
//				}
//				
//				
//				
//				
//				
//				
//				//총합, 평균, 최대, 최소 구하기
//				Scanner sc1=new Scanner(System.in);
//				System.out.println("몇 번 반복?"
//						);
//				int count=Integer.parseInt(sc1.nextLine());//solution: 몇 개를 넣는지를 따로 입력받기
//				
//				int total=0;
//				int avg=0;
//				int max=0;
//				int min=0;
//				
//				for(int i=0;i<count;i++) {
//					System.out.println("insert data");
//					int data=Integer.parseInt(sc1.nextLine());
//					
//					total+=data;
////					avg=total/count; count는 for문 밖에서 써야 함
//					
//					if(i==0) {
//						max=data;
//						min=data;
//					}
//					else {
//						if(max<data) {
//							max=data;
//						}
//						if(min>data) {
//							min=data;
//						}
//					}
////					if(i<[i-1]) {min=i;}
////					if(i>[i-1])max=i;
//				}
//				
//				avg= total/count;
//				
//				System.out.printf("평균:%5.2f\n",(double)total/count);
//				
//				System.out.println("최대값"+max+"최소값"+min);
//				
//				
//				
////				while(true) {
////					int adds=0;
////					int sums=0;
////					int maxs=0;
////					int mins=0;
////					int count=0;
////					Scanner calculate=new Scanner(System.in);
////					System.out.println("enter");
////					
////
////					int cal=Integer.parseInt(calculate.nextLine());
////					
////					int calc[]=cal;
////	
////					
////					count++;
////					
////					for(i=0;i<cal.length;i++) {
////						
////					}
////					sums= adds/count;
////					//maxs=
////					
////				}

		int answer = (int) (Math.random() * 100) + 1;

		Scanner integers = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int integer = Integer.parseInt(integers.nextLine());
		int counting = 0;
		System.out.println(answer);
		
		
		while (true) {
			
			if (answer < integer) {
				System.out.println("down");
				counting++;

				System.out.println("숫자를 입력하세요");
				integer=Integer.parseInt(integers.nextLine());

			} else if (answer > integer) {
				System.out.println("up");
				counting++;

				System.out.println("숫자를 입력하세요");
				integer=Integer.parseInt(integers.nextLine());
				
				//integers.nextline()의 출력값은 string임

			} else {
				counting++;
				System.out.println("정답입니다" + counting + "번 만에 맞추셨습니다.");
				break;
			}
			
			
		}
//		Scanner ans = new Scanner(System.in);
//		
//		boolean run=true;
//		while(run) {
//			System.out.println("1.plus 2.minus 3.multip 4.end");
//			System.out.println("input");
//			int num=Integer.parseInt(integers.nextLine());
//			
//			switch(num) {
//			case 1:
//				System.out.println("더하고자 하는 두 수 입력");
//				System.out.println("1>");
//				int num1=Integer.parseInt(integers.nextLine());
//				System.out.println("2>");
//				int num2=Integer.parseInt(integers.nextLine());
//				System.out.println(num1+num2+"="+(num1+num2));
//				
//			}
//		}
//		
		
		System.out.println("=========================insert coin");
		
		int money=Integer.parseInt(integers.nextLine());
		
		while(money>=500) {
			System.out.println((int)money/500+"번 남았음");
			System.out.println("1.가위바위보2.up&down3.종료");
			
			System.out.println("메뉴입력");
			int gameNo=Integer.parseInt(integers.nextLine());
			
			switch(gameNo) {
			case 1:
				money-=500;
			
			case 2:
				money-=500;
				
			case 3:
				System.out.println("close");
				money=0;
				break;
			}
			
			
			int month;
			do {
				System.out.println("add month");
				month=integers.nextInt();
				
			}while(month<1||month>12);
			
			System.out.println(month);
		}

	}

}
