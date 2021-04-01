package day0328.classEx01;

public class StudentTest {

	public static void main(String[] args) {
		Student n1 = new Student(); // Student는 자료형!  n1은 변수
		Student n2 = new Student(); // Studnet라는 자료형이 왼쪽의 인스턴스를 가르킨다
		Student n3 = new Student(); // 인스턴스 : 키워드 + 객체
		Student n4 = new Student(); // 힙 : 객체들을 담는 공간, 스택 : 변수를 담는 공각
		Student n5 = new Student();
		
		n1.name = "홍길동";
		n1.age = 20;
		n1.kor = 100;
		n1.eng = 100;
		n1.math = 100;
		n1.infor();
		n1.avg();
		
		n2.name = "홍길순";
		n2.age = 21;
		n2.kor = 90;
		n2.eng = 90;
		n2.math = 90;
		n2.infor();
		n2.avg();
		
		n3.name = "홍길만";
		n3.age = 22;
		n3.kor = 80;
		n3.eng = 80;
		n3.math = 80;
		n3.infor();
		n3.avg();
		
		n4.name = "홍길진";
		n4.age = 23;
		n4.kor = 70;
		n4.eng = 70;
		n4.math = 70;
		n4.infor();
		n4.avg();
		
		n5.name = "홍길준";
		n5.age = 24;
		n5.kor = 60;
		n5.eng = 60;
		n5.math = 60;
		n5.infor();
		n5.avg();
		
		

	}

}
