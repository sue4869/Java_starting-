package day0417.stringEx;

public class StringBufferEx01 {

	public static void main(String[] args) {
		String str = "하이";
		str = "하이!!"; // str을 변경한 것처럼 보인다. 그러나 위의 것과 객체가 다르다 
					   // 애초에 다른 객체를 만들어 다시 넣은것
		
		StringBuffer sb = new StringBuffer();
		sb.append("하이");
		sb.append("!!!!"); // 다른 객체를 써서 변경하는 것 // 문자열과 같이 새로 만드는 것에 쓰인다
		
		String s = sb.toString(); // StringBuffer타입을 String으로
		System.out.println(sb);
		sb.insert(2, new char[] {'a','b','c'}); //위치 2번에 문자열 a ,b ,c를 넣었다. 
		
		System.out.println(sb);

	}

}
