package inheritanceEx03;

public class Student extends Person{
	
	public Student(String name) { // 생성자
		super(name);  
	}
		int kor;
		int eng;
		int math;
	
		// 상속을 받았으나
		// 다른 동작을 하는 메서드로 만들고 싶다  -> 자손 클래스에 맞게 변경해야 하는 경우
		// 부모클래스로부터 상속받은 메서드의 내용을 변경하는 것.덮어씌우다
		//어노테이션 Override 
		
		@Override // 이걸 쓰면 부모가 가지고 있는 메서드와 같은 이름을 가져야 한다. 
		void printInfo() {
			System.out.println("이름 : " + name);
			System.out.println("국어 : " + kor + "수학 : " +math + "영어 : " +eng);
			// 메서드의 재정의. override
			// 부모의 메서드를 수정한다. 부모가 가지고 있는 메서드를 다른 기능을 하도록 하는 것
			// accessmodifier 클래스로 이동
		}
}
