package accessmodifierEx03;

public class MySingleTonClass {
	// 싱글톤패턴 만들기
	// 프로그램상 무수히 많이 생기고 삭제되는 객체로 인해 발생되는 문제를 해결하고자
	// 객체를 한번만 만들어 재사용 할 수 있도록 하는 방식 
	// -> 생성자가 여러 차례호출되더라도 실제로 생성되는 객체는 하나
	// -> 최초 생성 이후에 호출되는 생성자는 최초에 생성한 객체 반환
	// 자바에서는 생성자를 private으로 선언해서 생성불가하게 하고 getInstance()로 받아쓴다. 
	
	//1.
	// 생성자를 못만들도록 막는다: 외부에서 객체 생성을 막고
	private MySingleTonClass() { 
		
	}
	//static : 정적 -> 자바를 실행할때 처음 메모리에 로드되는 시점 (클래스가 만들어지는 시점)
	//객체는 메모리가 로드되는 순간에 객체가 한번만 만들어진다.
	//3.
	private static MySingleTonClass instance = new MySingleTonClass();
	
	//2. getInstance로만 객체를 만들 수 있게 한다. 
	public static MySingleTonClass getInstance() {
		return instance;
	}
	
	public void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
}
