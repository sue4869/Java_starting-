package day0424.listEx;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListEx01 {
	public static void main(String[] args) {
		
	//ArrayList : 배열과 같다.
	//LinkedList : 노드와 링크
	
	ArrayList<String> arrayList = new ArrayList<String>();
	LinkedList<String> linkedList = new LinkedList<String>();
	
	//취미를 리스트에 추가
	arrayList.add("게임");
	linkedList.add("게임");
	
	arrayList.add("운동");
	linkedList.add("운동");
	
	arrayList.add("독서");
	linkedList.add("독서");
	
	System.out.println("arrayList" + arrayList);
	System.out.println("linkedList" + linkedList);
	
	//index 2번째 값은?
	System.out.println("ArrayList의 index 2 :" + arrayList.get(2));
	System.out.println("LinkedList의 index 2 :" + linkedList.get(2));
	}
	
}
//차이
// 사용 목적이 다르다. 만들어진 방식

//linked : 참조하는 위치값을 포함한다. 따라서 데이터의 공간값과 그 데이터 다음에 올 데이터의 주소값을 갖는 공간이 필요하다
//       : 데이터와 주소를 갖는 하나를 노드라고 한다. 
//arrayList : a,b,c ==> 공간적으로 더 효율적이다. 해당되는 인덱스에 직접 접근가능하다. 
//          : 중간 지점에 추가할때, 그 뒤에 있는 것은 그 뒤로 미뤄야한다. 
//          : 배열을 이용하기 때문에 조회에 빠르다
//linked    : (a,b의 주소값) -- (b,c의 주소값) -- (c, null)
//          : a가 가지고 있는 b의 주소값을 타고 접근한다. 
//          : 조회하려면 비교해야할 값이 많다
//          : 추가 / 삭제할때 그냥 주소값만 바꾸면 되니까. 노드와 주소를 이요해서 추가/삭제 힐때 빠르다. 

















