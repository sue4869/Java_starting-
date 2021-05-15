package day0502.ioex01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class PracticeEx03 {

	public static void main(String[] args) {
		byte[] ori= {0,1,2,3,4,5,6,7,8,9};
		byte[] bagagi = new byte[3];
		
		byte[] copy;
		
		//결과 copy[0,1,2,3,4,5,6,7,8,9]
		//3로 나누어져서 딱떨이지지 않는다. 
				
		ByteArrayInputStream input = new ByteArrayInputStream(ori);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		System.out.println(input.read(bagagi,0,3)); //3
		System.out.println(Arrays.toString(bagagi)); // [0, 1, 2]
		
		System.out.println(input.read(bagagi,0,3)); //3
		System.out.println(Arrays.toString(bagagi)); // [3,4,5]
	
		System.out.println(input.read(bagagi,0,3)); //3
		System.out.println(Arrays.toString(bagagi)); // [6, 7, 8]
		
		System.out.println(input.read(bagagi,0,3)); //1
		System.out.println(Arrays.toString(bagagi)); // [9, 7, 8]
		
		int n = -1;
		while((n = (input.read(bagagi,0,3))) > 0) {
			output.write(bagagi, 0, n);
		}
		
		copy = output.toByteArray();
		
		System.out.println(Arrays.toString(copy));

	}

}
