package day0424.listEx;

public class LinkedList {

	public static void main(String[] args) {
		String[] food = new String[5];
		food[0] = "자장면";
		food[1] = "짬뽕";
		food[2] = "볶음밥";
		food[3] = "탕수육";
		
		//1. 양장피를 index 1에 추가하고 나머지값은 하나씩 뒤로 이동시킨 후 배열을 출력하시오
		
//		food[4] = food[3];
//		food[3] = food[2];
//		food[2] = food[1];
//		food[1] = "양장피";
		
		for(int i = 3; i > 0; i--) {
			food[i+1] = food[i];
		}
		food[1] = "양장피";
		
		for(int i = 0; i < food.length; i++) {
			System.out.print(i +":" + food[i] +" ");
		} 
		System.out.println(" ");
		
		//2.짬뽕을 삭제하고 뒤에 있는 내용은 앞으로 당겨서 배열로 출력
		food[2] = food[3];
		food[3] = food[4];
		food[4] = null;
		for(int i = 0; i < food.length; i++) {
			System.out.print(i +":" + food[i] +" ");
			}

	}

}
