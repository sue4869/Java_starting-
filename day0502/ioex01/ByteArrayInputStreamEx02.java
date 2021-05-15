package day0502.ioex01;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

//read(buf,offset,length)
public class ByteArrayInputStreamEx02 {
	public static void main(String[] args) {
		
		byte[] ori = {0,1,2,3,4,5,6,7,8,9};
		
		ByteArrayInputStream bin = new ByteArrayInputStream(ori);
		
		//바가지 역활을 하는 배열생성 // 한개씩이 아니라 여러개씩 읽게 하는 것
		byte[] bagagi = new byte[5];//바가지 만큼 읽는것
		
		int n = bin.read(bagagi,0,5);//0,1,2,3,4을 바가지에 넣고 //n은 읽은 개수
		System.out.println(Arrays.toString(bagagi));//0,1,2,3,4출력
		System.out.println("읽은 byte 길이" + n);
		
		bin.read(bagagi,0,5);//5,6,7,8,9를 바가지에 새로 넣고
		System.out.println(Arrays.toString(bagagi));//5,6,7,8,9출력
		System.out.println("읽은 byte 길이" + n);
		
		bin.read(bagagi,0,5);//읽은 값 없이 바가지 원래 있던거 읽는것
		System.out.println(Arrays.toString(bagagi));//5,6,7,8,9 다시 출력
		System.out.println("읽은 byte 길이" + n);//읽은 것이 없어서 -1이 출력
	}
}
