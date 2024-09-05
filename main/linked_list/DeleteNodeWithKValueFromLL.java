package linked_list;

public class DeleteNodeWithKValueFromLL {
	// 10=> 20 => 30 => 40 => null : delete node with 30 val
	
		public static LinkedListNode<Integer> deleteNodeWithValueKFromLL(LinkedListNode<Integer> head, int k){
			
			if(head==null) {
				return null;
			}
			
			//only one element so don't delete and return head
			if(head.next==null) {
				return head;
			}
			
			LinkedListNode<Integer> tail = head;
			
			while(tail!=null) {
				
				//store prev
			LinkedListNode<Integer> prev = tail;
			
				if(tail.data==k) {
					prev.next = tail.next.next;
					tail.next=null;
					return head;
				}
				tail = tail.next;
			}
			
			//k out of bound of LL  
			return head;
			
		}
}
