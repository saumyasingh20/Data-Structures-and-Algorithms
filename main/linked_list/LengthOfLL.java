package linked_list;

public class LengthOfLL {
	
	public static Integer lengthOfLL(LinkedListNode<Integer> head) {
		Integer count=0;
		LinkedListNode<Integer> tail = head;
		while(tail!=null) {
			count++;
			tail = tail.next;
		}
		return count;
	}

}
