package arrayEasy;


public class CheckArrayIsSortedAndRotated {
	
	
	public static boolean checkArrayIsSortedAndRotated(int[] arr) {
		
		//this count var will keep the count of pairs where sort order is 
		//violated
		int count = 0;
		int length = arr.length;
		for(int i = 1;i<length;i++) {
			/*if any curr element is smaller than its previous
			 element it means it has violated the sort order so inc count 
			*/
			if(arr[i]<arr[i-1]) {
				count++;
			}
		}
		
		if(arr[0]<arr[length-1]) {
			count++;
		}
		return count<=1?true:false;
		
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {3,4,5,1,2};
		boolean isSortedAndRotated = checkArrayIsSortedAndRotated(arr);
		System.out.println(isSortedAndRotated);
	}

}
