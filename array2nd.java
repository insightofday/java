package com.yedam.chap01;

import java.util.Arrays;

public class array2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]intAry= {{1,2,},{1,2,3}};//계단식 배열
		
		int[][]mathScore=new int[2][3];
		for(int i=0;i<mathScore.length;i++) {//mathScore.length==큰 배열 안의 갯수==2;
			System.out.println("mathScoreLength: "+mathScore.length);
			for(int j=0;j<mathScore[i].length;j++) {
				System.out.print(" mathScore["+i+"]["+j+"]="+ mathScore[i][j]+"\t");  //"\t"는 탭키 사용하기
				
			}
			System.out.println();
		}
	
		
		
		int[][]gugu=new int[8][9];//[n+1]단을(9단은 2에서9까지이므로 8개의 단이 존재함),[m]까지 수행==>{{2,4,6,8...}{3단의출력값}...{9단}}
		
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				gugu[i-2][j-1]=i*j;
				
				}
			}
		for(int i=0;i<gugu.length;i++) {
			System.out.print((i+2)+"단:");
			System.out.print(Arrays.toString(gugu[i]));
			System.out.println();
		}
		
		//참조타입 배열
		String[]strAry=new String[3];
		
		strAry[0]="yedam";
		strAry[1]="2";
		strAry[2]=new String("yedam");
		
		//주소값비교
		System.out.println(strAry[0]==strAry[1]);
		System.out.println(strAry[0]==strAry[2]);
		
		//데이터비교
		System.out.println(strAry[0].equals(strAry[2]));

		}
	
	

	}
	
	
