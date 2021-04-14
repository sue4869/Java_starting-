package ObjectEx01;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("짱구",10); // 사용자 정의 클래스 Person은 Object에 상속받았다.
		Person p2 = new Person("짱구",10);
		
		// 동일성 : 같은애(주소까지 같음) vs  동등성 : 같은 종류의 애(쌍둥이)
		if(p1.equals(p2)) { // 주소비교 // 동등성 찾기
			System.out.println("p1과 p2는 같다"); // 출력안됨
		} 
		if(p1 == p2) { // 동일성 찾기
			System.out.println("p1과 p2는 같다"); // 출력안됨
		}
		
		String name = "짱구"; // String 클래스라 object의 기능을 재정의함 // override함
		String name1 = new String("짱구");
		if( name.equals(name1)) {
			System.out.println("name.equals(name1)은 같다");//출력됨
		}
		if(name == name1) {
			System.out.println("name == name1은 같다"); // 출력안됨
		}
		
		// Object 클래서에 있는 것들
		p1.hashCode(); //동일서을 비교할때 씀 // 메모리의 주소를 반환하는 주소
		p1.toString();
		System.out.println(p1);//p1의 toString()메서드를 내부적으로 호출한다.
		System.out.println(p2);//p2 toString()메서드를 내부적으로 호출한다.
	}

}
