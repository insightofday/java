package com.yedam.chap01;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
//		int[] intAry2;
//		System.out.println("몇 개?>");
//		int num= Integer.parseInt(scanner.nextLine());
//		
//		intAry2=new int[num];
//		
//		int sum=0;
//		int avg=0;
//		int max=0;
//		int min=0;
//		
//		for(int i=0;i<intAry2.length;i++) {
//			System.out.println(intAry2[i]);
//			sum+=intAry2[i];//합 구하기
//		}
//		
		boolean run=true;
		int[]scores=null;
		int studentsNo=0;
		float avg=0;
		int max=0;
		int sum=0;
		
		
//		while(run) {
//			System.out.println("========================================");
//			System.out.println("1.학생수//2.점수입력//3.점수리스트//4.분석//5.종료");
//			System.out.println("========================================");
//			System.out.println("선택하세용>");
//			int selectNo=Integer.parseInt(scanner.nextLine());
//		
//			System.out.println("학생수는 몇명이에용?");
//			studentsNo=Integer.parseInt(scanner.nextLine());
//			scores=new int[studentsNo];
//			
//			if(selectNo==1) {
//				System.out.println(studentsNo);
//				
//			}
//			else if(selectNo==2) {
////				if(studentsNo==0) {
////					System.out.println("학생수를 입력하세요");
////					continue;
////				}
//				
//				for(int i=0;i<studentsNo;i++) {
//					System.out.println((i+1)+"번 학생의 점수를 입력해 주세요");
//					int score=Integer.parseInt(scanner.nextLine());
//					scores=new int[studentsNo];
//					scores[i]= score;
//				}
//				
//			}
//			else if(selectNo==3) {
////				if(scores==null) {
////					System.out.println("점수를 입력하세용");
////					continue;
////				}
//				for(int i=0;i<studentsNo;i++) {
//					System.out.println((i+1)+"번 학생의 점수를 입력해 주세요");
//					int score=Integer.parseInt(scanner.nextLine());
//					
//					scores[i]= score;
//					
//				}
//				
//				for(int i=0;i<studentsNo;i++) {
//					System.out.println("scores["+i+"]>"+scores[i]);
//				}
//			}
//			else if(selectNo==4) {
//				for(int i=0;i<studentsNo;i++) {
//					System.out.println((i+1)+"번 학생의 점수를 입력해 주세요");
//					int score=Integer.parseInt(scanner.nextLine());
//					
//					scores[i]= score;
//					
//				}
//				for(int i=0;i<scores.length;i++) {
//					if(max<scores[i]) {
//						max=scores[i];
//					}
//					sum+=scores[i];
//				}
//				avg=sum/scores.length;
//				
//				System.out.println("최고점수:"+max);
//				System.out.println("평균점수:"+avg);
//			}
//			else if(selectNo==5) {
//				
//				run=false;
//				//break all;
//			}
//		}
//		System.out.println("프로그램종료");
		
		
		
		
		
		
		
//		boolean run=true;
//		int[]scores=null;
//		int studentsNo;
//		float avg=0;
//		int max=0;
//		int sum=0;
//		
//		
		while(run) {
			System.out.println("========================================");
			System.out.println("1.학생수//2.점수입력//3.점수리스트//4.분석//5.종료");
			System.out.println("========================================");
			System.out.println("선택하세용>");
			int selectNo=Integer.parseInt(scanner.nextLine());
			
			if(selectNo==1) {
				System.out.println("학생수는 몇명이에용?");
				studentsNo=Integer.parseInt(scanner.nextLine());
				
				
			}else if(selectNo==2) {
				scores=new int[studentsNo];
				for(int i=0;i<studentsNo;i++) {
					System.out.println((i+1)+"번 학생의 점수를 입력해 주세요");
					scores=new int[studentsNo];
					int score=Integer.parseInt(scanner.nextLine());
					scores[i]= score;
				}
				
			}else if(selectNo==3) {
				for(int i=0;i<studentsNo;i++) {
					System.out.println("scores["+i+"]>"+scores[i]);
				}
			}else if(selectNo==4) {
				for(int i=0;i<scores.length;i++) {
					if(max<scores[i]) {
						max=scores[i];
					}
					sum+=scores[i];
				}
				avg=sum/scores.length;
				
				System.out.println("최고점수:"+max);
				System.out.println("평균점수:"+avg);
			}
			else if(selectNo==5) {
				
				run=false;
			}
		}
		System.out.println("프로그램종료");
		
		
	

	}//문제의 변수를 다 쓰지 않아서 종료가 제대로 되지 않음
	//문제의 조건을 보고 그것을 다 쓰도록 노력하라
}
	

