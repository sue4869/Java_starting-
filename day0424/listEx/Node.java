package day0424.listEx;

//LinkedList에서 사용하는 노드는 이런형태와 비슷하다
public class Node<T> {
	private T data;
	private Node next; // 다음 노드의 위치값 
	
	public Node(T data) { //(c,null)일경우
		this.data = data;
		next = null;
	}
	
	public Node(T data, Node next) {
		this.data = data;
		this.next = next;
	}
}
