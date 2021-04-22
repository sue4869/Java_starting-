package day0418.genericEx;

public class StoreTest {
	public static void main(String[] args) {
		StoreEx01 store = new StoreEx01();
		store.setData(10); //int만 가능하네? String도 저장하고 싶어 // StroeEx02 만듦
		
		System.out.println("저장된 데이터" + store.getData());// 저장하고 꺼내기
		
		StoreEx02 store2 = new StoreEx02(); // 기능은 같은데 타입만 달라 하나로 합치고 싶네
		store2.setData("사과");
		
		System.out.println("저장된 데이터 : " + store2.getdata());
	}
}
