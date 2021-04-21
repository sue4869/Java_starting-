package day0417.dateEx;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now(); //메서드로 구현해놓은 것의 예시
		System.out.println(now);
		
		System.out.println(now.getYear() + "년");
		System.out.println(now.getMonth()); //영어로 달이 나온다
		System.out.println(now.getMonthValue() + "월 "); // 숫자로 달이 나온다
		System.out.println(now.getDayOfMonth() + "일");
		System.out.println(now.getHour() + "시");
		System.out.println(now.getMinute() + "분");
		System.out.println(now.getSecond() + "초");
		System.out.println(now.getNano()+"나노초"); //10억분의 1초

		// 특정 일의 날짜는?
		LocalDate theDay = LocalDate.parse("2021-12-25");
		System.out.println(theDay); // 시 분 초를 뺀 나머지 date //2021-12-25출력
		LocalDateTime theDayTime = LocalDateTime.parse("2021-12-25T10:10:10"); // 기본적으로 시간 앞에 T를 넣어줘야 한다.
		System.out.println(theDayTime);
		LocalDateTime theDayTime2 = LocalDateTime.parse("2021-12-25T10:10:10",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		//DateTimeFormatter문자열을 내가 원하는 형태로 넣어준다. . 날짜 포맷 -> HH :24시 표현  hh :12시간
		System.out.println(theDayTime2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
	}

}
