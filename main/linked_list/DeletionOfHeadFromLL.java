package linked_list;

public class DeletionOfHeadFromLL {
	
	public static LinkedListNode<Integer>deleteHeadFromLL(LinkedListNode<Integer> head){
		
		LinkedListNode<Integer> newHead= head.next;
		head.next=null;
		return newHead;
				
	}

}
