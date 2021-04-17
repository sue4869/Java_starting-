package day0417;

public class HomeWork {
	public static void main(String[] args) {
		
	
	//숙제 : <div> 와 </div> 사이의 글자를 추출하여 출력
	// 그 사이의 글자가 무엇이 올지 모른다는 가정
	// <div> 와 </div>밖에도 다른 글자가 섞여있을 수 있음. 
	String str5 ="<div>안녕하세요 </div>";
	String str6 ="<div>im groot im groot </div>";
	String str7="<html><section><div>hello world!!</div></section></html>";
	
	
	String[] str5Arr = str5.split("<div>|</div>");
	System.out.println(str5Arr[1]);
	
	
}
}
