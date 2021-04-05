package day0403.classEx05;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 몇명?");
		int number = sc.nextInt();
		
		Student[] student = new Student[number]; // 배열선언
		int ageSum = 0;
		int mathSum = 0;
		int engSum = 0;
		int korSum = 0;
		for(int i = 0; i < number; i++) {
			student[i] = new Student(); // 객체 만들기
			student[i].score = new Score();
			
			System.out.println("이름");
			String name = sc.next();
			
			System.out.println("나이");
			int age = sc.nextInt();
			
			System.out.println("수학성적");
			int mathScore = sc.nextInt();
			
			System.out.println("영어성적");
			int engScore = sc.nextInt();
			
			System.out.println("국어성적");
			int korScore = sc.nextInt();
			
			student[i].name = name ;
			student[i].age = age;
			student[i].score.math = mathScore;
			student[i].score.eng = engScore;
			student[i].score.kor = korScore;
			
			ageSum += student[i].age;
			mathSum += student[i].score.math;
			engSum += student[i].score.eng;
			korSum += student[i].score.kor;
			
			System.out.print(student[i].name + " ");
		}
		
		System.out.println(mathSum / number);
		System.out.println(engSum / number);
		System.out.println(korSum / number);
		

	}

}
