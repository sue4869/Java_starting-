package day0418.genericEx05;

public class StoreArray<T> {
	T[] data; //배열
	
	// 배열을 만들때는 object배열로 만든 후 T타입으로 변환하는 식으로 만들어야 한다.
	public StoreArray() {
		data = (T[])(new Object[10]);
	}
}
