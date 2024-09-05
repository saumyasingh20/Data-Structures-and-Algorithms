package linked_list;

public class DeleteKthPositionNodeFromLL {
	
	// 1=> 2 => 3 => 4 => null : delete node at 3rd position
	
	public static LinkedListNode<Integer> deleteKthNodeFromLL(LinkedListNode<Integer> head, int k){
		
		if(k==0 || head==null) {
			return null;
		}
		
		//only one element so don't delete and return head
		if(k==1) {
			return head;
		}
		
		int curr= 1;
		
		LinkedListNode<Integer> tail=head;
		
		while(tail!=null) {
			//reach element before kth position
			if(curr==k-1) {
				tail.next = tail.next.next;
				return head;
			}
			curr++;
			tail = tail.next;
		}
		
		//k out of bound of LL  
		return head;
		
	}

}
