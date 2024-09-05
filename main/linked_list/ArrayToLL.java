package linked_list;

import java.util.List;

public class ArrayToLL {
	
	public static void main(String[] args) {
		List<Integer> arr = List.of(1,23,44,4,7,8);
		LinkedListNode<Integer>  head = convertArrayToLL(arr);
		System.out.println(head.data);
	}

	private static LinkedListNode<Integer> convertArrayToLL(List<Integer> arr) {
		LinkedListNode<Integer> head = new LinkedListNode<>(arr.get(0));
		LinkedListNode<Integer> tail = head;
		for(int i=1; i<arr.size(); i++) {
			LinkedListNode<Integer> temp = new LinkedListNode<Integer>(arr.get(i));
			tail.next=temp;
			tail = temp;
			
		}
		return head; 
		
	}

}
