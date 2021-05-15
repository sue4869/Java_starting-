package day0502.ioex01;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayOutputStreamEx01 {

	public static void main(String[] args) {
		//output : 원래는 목적하는 곳에 쓰도록 하는 것
		// 근데 ByteArrayOutputStream만 특이하게 자기자신에게만 저장
		
		//결과를 담을 배열
		byte[] result;
		
		//아웃풋스트림을 생성 //쓰는 동작을 하는 객체다
		//원래 ()에 쓸 대상을 넣지만 이건 자기자신에게 저장하여 인자가 필요없다. 
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		//스트림자체에 write을 한다. 
		out.write(0);//int 타입으로 반환하지만 1바이트만 함 //0을 스트림 자신에게 저장
		out.write(1);
		out.write(2);
		out.write(3);
		out.write(4);
		out.write(256);//256은 1바이트로 출력할 수 없는 숫자 :0으로 반환
					   // 0000 0001 0000 0000인데 0000 0000만 들어감
		//스트림안에 있는 내용을 바이트 배열로 반환
		result = out.toByteArray();
		System.out.println(Arrays.toString(result));
		}

}
