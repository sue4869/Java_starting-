package day0418.genericEx04;

public class StoreTest {

	public static void main(String[] args) {
		//<>사이는 래퍼타입으로 넣어야 한다. 
		Store<String, Integer> store = new Store<String, Integer>();
		store.setData1("사과");
		store.setData2(10);
		
		String s = store.getData1();
		int a = store.getData2();

	}

}
