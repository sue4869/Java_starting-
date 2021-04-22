package day0418.collectionEx02;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		//3명의 user객체를 생성하여 arraylist 에 담고
		//arraylist에 담긴 내용을 활용하여.
		//모든 사람의 이름과 나이를 출력,
		//모든 사람의 나이 총합을 구하여라.
		
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User("홍길동",10));
		userList.add(new User("홍길순",10));
		userList.add(new User("홍길만",10));
		
		for(int i =0; i < userList.size(); i++ ) {
			System.out.println(userList.get(i));//user라는 클래스가 String을 오버라이드한 것
		}
		
		int tot = 0;
		for(User u : userList) { //컬렉션 속 데이터 : 컬렉션 또는 배열//안에 있는 것을 꺼내는것은 좋으나 대입하기 어렵다. 몇번째 인지 모름
			tot += u.getAge();
		}
		System.out.println(tot);
	}

}
