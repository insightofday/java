package System;

import java.util.Random;

public class system {
	public static void main(String[] args) {
		//강제종료하귀!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				//System.exit(0);//jvm강제종료
			}
		}
		System.out.println("shut down the program");
	
	
	
	////현재시간읽기~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		long startTime=System.nanoTime();
		long sum=0;
		for(long i=0;i<999999999;i++) {
			sum+=i;
		}
		long endTime=System.nanoTime();
		System.out.println("sum is "+sum);
		System.out.println(endTime-startTime+"걸림");
		System.out.println();
		System.out.println(System.currentTimeMillis());
		
		/////////////중복되지 않은 데이터를 구할 때 이걸 쓴다~~~~~~~~~~
		//Random(seed)의 매개변수에 system.currentTimeMills등을 넣으면 환상의 조합~
		//Math.random()아님
		
		System.out.println();
		Random r=new Random(System.currentTimeMillis());
		
		System.out.println(r.nextInt());
		///seed를 key처럼 사용하여 중복되지 않은 숫자를 출력가능
		//예:10넣으면 나오는 값은 항상 같아
		
	}
}
