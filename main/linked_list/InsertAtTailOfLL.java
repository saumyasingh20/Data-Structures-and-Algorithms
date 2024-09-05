package linked_list;

public class InsertAtTailOfLL {

	public static LinkedListNode<Integer> insertAtTail(LinkedListNode<Integer> head, Integer data){
		if(head==null)
			return new LinkedListNode<Integer>(data);
		
		//only one node in ll
		if(head.next==null) {
			LinkedListNode<Integer> tail= new LinkedListNode<Integer>(data);
			head.next=tail;
			return head;
		}
		
		//more than one node
		//reach till the current tail
		
		LinkedListNode<Integer> temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		LinkedListNode<Integer> tail=new LinkedListNode<Integer>(data);
		temp.next = tail;
		return head;
					
	}
}
