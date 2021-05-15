package day0502.ioex01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class PracticeEx02 {

	public static void main(String[] args) {
		byte[] ori = new byte[100];
		byte[] copy;
		
		for(int i = 0; i < 100; i++) {
			ori[i] = (byte)i;
		}
		
		byte[] bagagi = new byte[10]; //buf로 바가지 역활 // 한번 읽을때마다 10byte읽는다
		
		//인풋스트림을 읽으려는 데이터를 연결시켜서 객체를 만들어준다. 
		ByteArrayInputStream input = new ByteArrayInputStream(ori);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		//input.read(bagagi,0,10) //바가지에 데이터 10개가 담긴다. 개수니까 10을 반환
		//output.write(bagagi,0,10) //아웃풋에 바가지에 있는 것을 쓴다. 
		//데이터가 어디에 담기는가?를 고민해봐야한다. 
		while(input.read(bagagi,0,10) > 0) {
			System.out.println(Arrays.toString(bagagi));
			output.write(bagagi,0,10); //데이터 읽은 값이 그대로 바가지로 들어가 있으니 그대로 써주겠다. 
		}
		
		copy = output.toByteArray();
		System.out.println(Arrays.toString(copy));
	}

}
