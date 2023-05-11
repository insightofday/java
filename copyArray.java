package com.yedam.chap01;

public class copyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]oldAry= {1,2,3};
		int[]newAry=new int[5];
		
		for(int i=0;i<oldAry.length;i++) {
			newAry[i]=oldAry[i];
		}
		for(int i=0;i<newAry.length;i++) {
			System.out.println(newAry[i]);
		}
		
		int[]oldAry2= {1,2,3,4,5,6,7};
		int[]newAry2= new int[10];
		
		System.arraycopy(oldAry2, 1, newAry2, 3, oldAry2.length-1);
		System.out.println();
		for(int i=0;i<newAry2.length;i++) {
			System.out.println(newAry2[i]);
		}
		for(int temp:newAry2) {
			System.out.print(temp+"\t");
		}
		
		
		
		
	}

}
