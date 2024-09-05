package linked_list;

public class InsertAtHeadOfLL {
	
	public static LinkedListNode<Integer> insertAtHead(LinkedListNode<Integer> head, Integer data){
		if(head==null)
			return null;
		
		//new node with given data and next pointing to head
		return new LinkedListNode<Integer>(data,head);
	}

}
