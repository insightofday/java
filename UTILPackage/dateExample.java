package UTILPackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class dateExample {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD hh시mm분ss초");//원하는 날짜형식 지정가능
		System.out.println(sdf.format(date));
		
		Calendar now=Calendar.getInstance();
		int year=now.get(Calendar.YEAR);
		int month=now.get(Calendar.MONTH);
		int day=now.get(Calendar.DAY_OF_MONTH);
		int week=now.get(Calendar.DAY_OF_WEEK);
		
		String weeky="";
		switch (week) {
		case 1:
			weeky="일요일";
			break;
		case Calendar.MONDAY:
			weeky="월요일";
			break;
		case 3:
			weeky="화요일";
			break;
		case Calendar.WEDNESDAY:
			weeky="수요일";
			break;
		case Calendar.THURSDAY:
			weeky="목요일";
			break;
		case 6:
			weeky="금요일";
			break;
		case 7:
			weeky="토요일";
			break;

		}
		int amPm=now.get(Calendar.AM_PM);
		String strAmPm="";
		if(amPm==0) {
			strAmPm="am";
		}else {
			strAmPm="pm";
		}
		
		
		//12시간버전의 시간
		int hour=now.get(Calendar.HOUR);
		
		//24시간버전의 시간
		int hour24=Calendar.HOUR_OF_DAY;
		
		//Calendar.HOUR_OF_DAY; 에러뜸
		//다른 패키지의 지역변수를 쓰려면 iv에 그것을 할당해야 함
		//Syntax error, insert"variable De0clarators"to complete local variable declaration
		
		int minute=now.get(Calendar.MINUTE);
		int second=now.get(Calendar.SECOND);
		
		System.out.print(year+"년 ");
		System.out.print(month+"월 ");
		System.out.print(day+"일 ");
		System.out.print(weeky+" ");
		System.out.print(strAmPm+" ");
		System.out.print(hour+"시 ");
		System.out.print(minute+"분 ");
		System.out.print(second+"초");

	}

}
