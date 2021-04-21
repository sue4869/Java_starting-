package day0417.objectEx;

public class UserTest {

	public static void main(String[] args) {
		// Object 클래스 -> java.lang패키지 안에 있다. 굳이 import를 안해도 된다. 
		Object o = new Object();
		User u1 = new User(100, "빈센조", 30);
		User u2 = new User(0, "빈센조",30);
		User u3 = new User(101, "빈센조", 30);

		System.out.println("u1:" + u1.toString());//주소가 출력된다. 
		System.out.println("u2:" + u2); //안써도 toString 메서드가 호출되고 있는것. 위에 문장과 같다

		//	    public String toString() {
		//	        return getClass().getName() + "@" + Integer.toHexString(hashCode());
		//	    }
		//	    hexString은 16진수로 표현하는 방법이다 == > 기본적으로 객체

		//이름, 나이, 주소가 나오도록 한다 ==> User 클래스에서 toString을 오버라이드 한다. 
		System.out.println(u1);

		System.out.println(u1.hashCode());

		//동일성 : 객체가 같은거까지 확인(주소비교)
		if(u1 == u3) {
			System.out.println("u1 == u3는 동일하다");
		}
		else {
			System.out.println("u1 == u3는 동일하지 않다");
		}

		// 주소비교
		if(u2.equals(u3)) { //object에서 정의한 그대로의 기준으로만 쓰니까 (객체 비교) 문자열 비교가 안되는 것
			System.out.println("u3.equals(u3)는 동등하다");
		}
		else {
			System.out.println("u3.equals(u3)는 동등하지 않다"); //출력
		}
		// Object 속 equals ==> 객체로 비교하게 되어 있다
		//		 public boolean equals(Object obj) {
		//		        return (this == obj);
		//		    } // this는 객체 자신 : equals , obj 는 입력받은 객체

		// 문자열 비교를 위해서는 euqals를 오버라이드해야한다. 

		// 두객체는 다르나, 문자열 비교한다. 
		String str1 = new String("빈센조");
		String str2 = new String("빈센조");

		if(str1 == str2) {
			System.out.println("str1 == str2는 같다");
		} else {
			System.out.println("str1 == str2는 다르다"); //주소가 다르게 출력
		}

		if(str1.equals(str2)) {// String 자체에서 equals를 오버라이드했기에 그냥 문자열 비교가 되는것
			System.out.println("str1.equals(str2)는 같다");
		}
		else {
			System.out.println("str1.equals(str2)는 다르다");
		}
	}

}
