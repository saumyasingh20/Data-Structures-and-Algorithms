package linked_list;


public class InsertNodeAtKthPosition {
	
	public static LinkedListNode<Integer> insertAtKthPositionInLL(LinkedListNode<Integer> head,int k, Integer data){
		if(k==1) {
			if(head==null)
				return new LinkedListNode<Integer>(data);
			
			LinkedListNode<Integer> tail =  new LinkedListNode<Integer>(data);
			head.next=tail;
			return head;
		}
		int curr= 1;
		LinkedListNode<Integer> tail =head;
		while(tail.next!=null) {
			if(curr==k-1) {
				LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
				newNode.next=tail.next;
				tail.next = newNode;
				break;
			}
		}
		return head;
	}

}
