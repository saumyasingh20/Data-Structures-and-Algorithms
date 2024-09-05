package arrayEasy;

public class CheckArrayIsSorted {
	
	
	public static boolean checkArrayIsSorted(int[]arr) {
		//compare with previous element
		if(arr.length<=1)
			return true;
		if(arr.length==2) {
			boolean isSorted= arr[0]<arr[1]?true:false;
			return isSorted;
		}
		
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[] = new int[] {12,35,1,10,34,1};
		boolean isSorted = checkArrayIsSorted(arr);
		System.out.println(isSorted);

	}

}
