package day0418.genericEx04;

public class Store<T,E> { //<>사이는 영어 아무거나 써도 된다.
	//저장하는 아이가 2개라면?
	private T data1;
	private E data2;
	
	public void setData1(T data1) {
		this.data1 = data1;
	}
	
	public T getData1() {
		return data1;
	}
	
	public void setData2(E data1) {
		this.data2 = data2;
	}
	
	public E getData2() {
		return data2;
	}

}
