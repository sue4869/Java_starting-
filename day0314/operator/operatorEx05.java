package day0314.operator;

public class operatorEx05 {

	public static void main(String[] args) {
		// 비트 연산자 : 연산 속도가 빠르다
		// 가독성이 안좋음 &, | ,~,^,<<,>>
		//& : 비트간의 and 연산
		//| : 비트의 OR연산
		//~ : 비트의 not연산
		//^ : 비트의 XOR연산
		//<< : 비트를 숫자만큼 왼쪽으로 이동
		//>> : 비트를 숫자만큼 오른쪽으로 이동
		
		byte num = 1;//0000 0001
		byte num1 = 5;//0000 0101
		System.out.println(num & num1);//같은 위치에 1있는거 0000 0001// 출력1
		System.out.println(num | num1);//같은 위치에 둘중하나라도 1있으면 0000 0101//출력5
		System.out.println(num ^ num1);// 0000 0100
		System.out.println(~num1);//1111 1010
		
		//왼쪽으로 한칸 이동할때마다 2배씩 증가 //3칸 이동이면 8배
		System.out.println(num << 1);//0000 0101 -> 000 1010
		System.out.println(num << 2);//0000 0101 -> 001 0100
		
		//오른쪽으로 이동할때마다 1/2씩 감소한다.
		System.out.println(num >> 1); // 0000 0010
		System.out.println(num >> 2); // 0000 0001
				

	}

}
