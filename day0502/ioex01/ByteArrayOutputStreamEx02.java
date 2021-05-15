package day0502.ioex01;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayOutputStreamEx02 {

	public static void main(String[] args) {
		byte[] result; //바이트를 저장할 곳 만듦
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		
		byte[] bagagi = new byte[5]; //buf를 만든것
		
		//쓰고자 하는 바가지에 데이터가 넣어져 있어야 한다. 
		for(int i=0; i< bagagi.length; i++) {
			bagagi[i] =(byte)i;
		}//[0,1,2,3,4]
		bout.write(bagagi,0,5); //한꺼번에 쓰기 /반환타입없음
		
		for(int i=0; i< bagagi.length; i++) {
			bagagi[i] += 5; // +=가 알아서 형변환해줘서 byte로 바꿔준다.
		}//[5,6,7,8,9]
		bout.write(bagagi,0,5);
		
		result = bout.toByteArray();
		System.out.println(Arrays.toString(result));
	}

}
