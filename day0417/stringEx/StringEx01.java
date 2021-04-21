package day0417.stringEx;

public class StringEx01 {

	public static void main(String[] args) {
		// String 문자열을 다루는 클래스 
		String str1 = "abcdefghijklmnop"; // 클래스여서 객체로 취급
		
		// 대문자로 변경
		System.out.println(str1.toUpperCase()); //메서드로 반환되었는지 문자열 자제만 반환된것인지?
		System.out.println(str1); // 문자열 자체만 반환된것
		
		// 소문자 변경
		System.out.println(str1.toLowerCase());
		
		// 첫번째 문자만 대문자로 변경해서 출력
		
		String str2 = "AbcDefGhijklmnop";
		String lowerStr2 = str2.toLowerCase(); // 다 소문자로
		// 하나를 뽑아야 하기 때문에 배열로 바꾼다
		char[] arrayStr2 = lowerStr2.toCharArray();
		arrayStr2[0] -= ('a' - 'A');
		
		System.out.println(arrayStr2);
		System.out.println(new String(arrayStr2)); // 왜 굳이 객체로 만들지??
		
		// 배열을 쓰지 않고 특정 위치에 접근하는 메서드
		str2.charAt(5); // charAt : 특정 인덱스의 char을 반환
		
		// 특정문자의 위치는?
		System.out.println(str2.indexOf('g'));
		// 이때 중복되거나 찾고자 하는 것이 문자열이면?
		String str3 = "귀여운 뚜루루 뚜루 바닷속 뚜루루 뚜루 아기상어";
		System.out.println("뚜루루 뚜루" + str3.indexOf("뚜루루 뚜루"));
		
		//중복되면?
		//System.out.println(str2.indexOf("문자열", 첫시작 인덱스));
		
		String str4 = "아기 상어 뚜 루루 뚜루 귀여운 뚜 루루 뚜루 바닷속 뚜 루루 뚜루 아기 상어 엄마 상어 뚜 루루 뚜루 어여쁜 뚜 루루 뚜루 바닷속 뚜 루루 뚜루 엄마 상어! 아빠 상어 뚜 루루 뚜루 힘이 센 뚜 루루 뚜루 바닷속 뚜 루루 뚜루 아빠 상어! 할머니 상어 뚜 루루 뚜루 자상한 뚜 루루 뚜루 바닷속 뚜 루루 뚜루 할머니 상어! 할아버지 상어 뚜 루루 뚜루 멋있는 뚜 루루 뚜루 바닷속 뚜 루루 뚜루 할아버지 상어! 우리는 뚜 루루 뚜루 바다의 뚜 루루 뚜루 사냥꾼 뚜 루루 뚜루 상어 가족! 상어다 뚜 루루 뚜루 도망쳐 뚜 루루 뚜루 도망쳐 뚜 루루 뚜루 숨자! 으악! 살았다 뚜 루루 뚜루 살았다 뚜 루루 뚜루 오늘도 뚜 루루 뚜루 살았다 휴! 신난다 뚜 루루 뚜루 신난다 뚜 루루 뚜루 춤을 춰 뚜 루루 뚜루 노래 끝 오예!";
		System.out.println("---------------------");
		// " 뚜 루루 뚜루"는 총 몇번 나오는가?
		System.out.println(str4.indexOf("뚜 루루 뚜루")); //6
		System.out.println(str4.indexOf("뚜 루루 뚜루" , 7));//18
		System.out.println(str4.indexOf("뚜 루루 뚜루" , 19));//30
		
		String searchWord = "뚜 루루 뚜루";
//		int cnt = 0;
//		for (int i = 0; i < str4.length(); i++) { // for은 횟수가 정해졌을때만 사용하는게 좋으니 여기서는 while을 쓰는 것이 좋다
//			i = str4.indexOf(searchWord, i+1); 
//			cnt += 1;
//		}
//		System.out.println(cnt);
		int f = -1; // 못찾았을 경우 -1이 나오게
		int cnt = 0;
		while( (f = str4.indexOf(searchWord, f+1)) != -1) { // 찾을경우
			cnt += 1;
		}
		System.out.println(cnt);
		
		// 문자열 추출
		String phone = "010-1009-1009";
		//subString(시작 index, 미포함할 끝 index)
		String phoneNumber = phone.substring(0,3);
		phoneNumber += phone.substring(4,8);
		phoneNumber += phone.substring(9);
		System.out.println("폰번호" + phoneNumber);
		
		// 앞뒤 공백 
		// 아이디 입력, 비밀번호 입력할 때
		String str5 = "    im groot";
		System.out.println("공백 제거 전: " + str5);
		System.out.println("공백 제거 후: " + str5.trim()); // trim : 잘라내다
		
		// 문자열 교체
		// 뚜루루 뚜루 -> 그랑죠
		System.out.println("글자교체");
		//str4.replaceAll(regex, replacement); // regex : 정규식 표현
		// 정규식 표현 설명 : https://blog.naver.com/zzang9ha/222013925468
		// 문자열의 규칙 : 이메일 --> 문자열 + @ + 문자열..
		System.out.println(str4.replace("뚜 루루 뚜루","그랑죠"));
		

	}

}
