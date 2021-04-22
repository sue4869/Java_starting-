package day0418.genericEx02;

public class StoreObject {
	//모든 클래스의 부모가 object인 것을 이용해 다른 타입들도 다 들어가게 하자
	private Object data;
	
	public void setData(Object data) {
		this.data = data;
	} // 부모타입의 객체에 자식 타입의 객체가 들어갈 수 있다.
	
	public Object getData() {
		return data;
	}
}
