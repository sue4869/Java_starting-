package day0502.ioex01;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEx01 {

	public static void main(String[] args) {
		// 데이터
		byte[] inByteData = {0,1,2,3,4,5,6,7,8,9};
		
		//메모리(배열)에서 데이터를 읽어오는 아이
		//바이트 배열에서 데이터를 읽는 씽크스트림 변수 선언
		ByteArrayInputStream input = null; //변수만 만든 상태. 아직 객체는 없다.
		
		// 어디서 읽어올지 씽크스트림(ByteArrayInputStream)과 연결하여 객체를 생성한다. 
		//데이터(inByteData)와 싱크스트림을 연결함
		input = new ByteArrayInputStream(inByteData);
		//씽크스트림은 데이터에 수도꼭지 역활. 수도꼭지 트는 역활 : read()
		
		//읽어온 내용을 출력
		System.out.println("읽어온 내용 :" + input.read());//0출력
		System.out.println("읽어온 내용 :" + input.read());//1출력
		//그렇다면 데이터 안을 다 읽으려면? ==> 총 10번 반복. //11번 읽으면? -1이 반환
		//그렇다면 어디까지 읽어야 하나? 데이터 길이를 기준으로 하면 실제로는 데이터를 외부에서 받아오기에 애매해진다. 
		//-1이 나올때까지만 읽게 한다. 

		while(input.read() != -1) {//0 //2
			System.out.println("읽어온 내용:" + input.read()); //1
		}
		
		// 그러나 위처럼하면 read를 두번씩해서 빼먹는게 발생
		//byte로 읽고 int로 만환하는 것은 -1을 표현하지 않기 위해. 양수로 나온다. 1000 0000
		
		//읽은 데이터를 data로 저장한 후, 그것을 읽도록 한다. 
		//첫번째 방법
		int data = -1;
		while((data = input.read()) != -1) {
			System.out.println("읽어온 내용:" + input.read());
		}
		
		//두번째 방법
		while(input.available() > 0) {//읽을 수 있는 것이 있는가?
			System.out.println("읽어온 내용:" + input.read());
		}
		
		
		

	}

}
