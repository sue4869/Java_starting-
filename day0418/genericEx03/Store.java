package day0418.genericEx03;

//<T> :타입이 아무것도 안정해졌을때
public class Store<T> {
	
	private T data;
	
	public void setData(T data) {
		this.data = data;
	} // 부모타입의 객체에 자식 타입의 객체가 들어갈 수 있다.
	
	public T getData() {
		return data;
	}
}
