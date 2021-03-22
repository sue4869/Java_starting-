package day0314.operator;

public class operatorEx02 {

	public static void main(String[] args) {
		// 증감연산자 : 변수 자체가 변함
		//후위연산(연산자가 뒤에),전위연산(연샂자가 앞에)
		//++,--(1씩 증가, 1씩 감소)
		int num = 0;
		System.out.println("num + 1 : " + (num+1));//num인 변수 자체는 증가가 아님. 계싼만 해준거
		System.out.println("num     : " + num); //num은 그대로 0
		num = num + 1;// num은 1 //이제는 num 자체가 증가
		System.out.println("num = num + 1 :"+ num);
		
		num++; //num = num + 1 // num=2가 됨
		System.out.println("num++ :" + num);
		
		//후위연산과 전위연산의 차이 
		int a = 0;
		int b = 0;
		System.out.println("a++ :" +(a++));//a=0 //출력 후 증가
		System.out.println("++b :" +(++b));//b=1 //증가시킨 후 출력
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		
		int number = 10;
		number = number + number; //number =20
		System.out.println(number+10);//number=20//출력30
		System.out.println(number++);//number=21//출력20
		System.out.println(number++);//number=22//출력21
		System.out.println(number-20);//number=22//출력2
		System.out.println(--number);//number=21//출력21

	}

}
