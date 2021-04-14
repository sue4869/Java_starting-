package accessmodifierEx03;

public class SingleTonTest {

	public static void main(String[] args) {
		//Math.random(); //Math는 정적으로 만들어져 있기에 클래스로 쓸수있다
		MySingleTonClass m1 = MySingleTonClass.getInstance();//객체 생성
		m1.sum(10, 20);
		
		MySingleTonClass m2 = MySingleTonClass.getInstance();
		m2.sum(20, 30);
	}

} // Staic으로
