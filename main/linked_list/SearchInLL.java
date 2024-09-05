package linked_list;

public class SearchInLL {
	
	public static boolean searchInLL(LinkedListNode<Integer> head, Integer target) {
		LinkedListNode<Integer> tail = head;
		while(tail!=null) {
			if(tail.data==target) {
				return true;
			}
			tail = tail.next;
		}
		return false;
	}

}
