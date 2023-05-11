package com.yedam.chap01;

import java.util.Calendar;

public class enumc {//클래스는 첫글자가 대문자여야 함

	public static void main(String[] args) {
		
		//enum에서 만들어진 mon~sun까지를 today라는 변수에 대입가능
		week today=null;
		Calendar cal=Calendar.getInstance();
		
		int Week=cal.get(Calendar.DAY_OF_WEEK);
		switch(Week) {
		case 1:
			today=week.SUNDAY;
			break;
		
		case 2:
			today=week.MONDAY;
			break;
			
		case 3:
			today=week.TUESDAY;
			break;
			
		case 4:
			today=week.WEDNESDAY;
			break;
			
		case 5:
			today=week.THURSDAY;
			break;
			
		case 6:
			today=week.SUNDAY;
			break;
			
		case 7:
			today=week.SUNDAY;
			break;
		}
		
System.out.println(today);
	}

}
