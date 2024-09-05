package linked_list;

public class LinkedListNode<T> {
	
	T data;
	LinkedListNode<T> next;
	public LinkedListNode(T data, LinkedListNode<T> next) {
		super();
		this.data = data;
		this.next = next;
	}
	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
	
	

}
