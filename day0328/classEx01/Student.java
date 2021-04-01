package day0328.classEx01;

public class Student {
	String name;
	int age;
	int kor;
	int eng;
	int math;
	
	void infor() {
		System.out.println("name :" + name + ", age :" + age + ", 국어성적 :" + kor + ", 영어성적:" + eng + " 수학성적: " + math );
	}
	
	void avg() {
		int avg = (kor + eng + math);
		//System.out.println("이름:"+ name + ", 국어:"+ kor +", 영어:" + eng + ", 수학:" + math +", 평균"+ avg);
		System.out.printf("이름:%s, 국어:%d, 영어:%d, 수학:%d, 평균:%f \n", name,kor, eng, math,avg);
	}
}
