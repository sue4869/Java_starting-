package day0417.dateEx;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx {

	public static void main(String[] args) {
		// 날짜, 달력에 관련한 클래스 
		Date date = new Date(); // 잘 안쓴다
		System.out.println(date); //KST : Korea Standart Time
		
		// 싱글톤은 아니나 내부자체적으로 객체를 만들어서 쓴다
		// Calendar 클래스는 추상클래스라서 new 연산자를 이용해 객체를 생성할 수 없다
		// 대신 클래스의 정적메서드인 getInstance() 메서드를 이용해 현재 OS에 설정되어 있는 시간대를 기준으로 한 Calendar 하위객체를 얻을 수 있다.  
		Calendar now = Calendar.getInstance(); 
		// Calendar 객체를 얻었다면, get() 메서드를 이용해 정보를 읽을 수 있다. 
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int date2 = now.get(Calendar.DAY_OF_MONTH);
		
		
		System.out.println(year + "년");
		System.out.println((month+1) + "월"); //월은  0~11로 표현되어서  +1해줘야 한다. 
		System.out.println(date2 + "일");
		
		int day = now.get(Calendar.DAY_OF_WEEK); //숫자로 표현되기에 바꿔줘야 한다. 
		switch(day) {
		case Calendar.MONDAY :
			System.out.println("월요일");
			break;
		case Calendar.TUESDAY:
			System.out.println("화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("수요일");
			break;
		case Calendar.THURSDAY:
			System.out.println("목요일");
			break;
		case Calendar.FRIDAY:
			System.out.println("금요일");
			break;
		case Calendar.SATURDAY:
			System.out.println("토요일");
			break;
	
		}
		
		//오전, 오후
		int amPm = now.get(Calendar.AM_PM);
		if(amPm == Calendar.AM) {
			System.out.println("오전");
		}
		else {
			System.out.println("오후");
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.printf("%d시 %d분 %d초" , hour, minute,second);

	}

}
