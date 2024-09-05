package linked_list;

public class TraverseLL {
	
	public static void traverseLL (LinkedListNode<Integer> head){
		LinkedListNode<Integer> tail = head;
		while(tail!=null) {
			System.out.println(tail.data);
			tail = tail.next;
		}
	}

}
