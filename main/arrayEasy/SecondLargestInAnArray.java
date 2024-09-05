package arrayEasy;

public class SecondLargestInAnArray {
	
	public static int print2largest(int arr[], int n) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = largest;
        
        for(int i = 0;i<n;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i]>secondLargest && arr[i]<largest) {
            	secondLargest=arr[i];
            }
        }
        return secondLargest;
        
    }

	public static void main(String[] args) {
		int arr[] = new int[] {12,35,1,10,34,1};
		int secondLargest = print2largest(arr, arr.length);
		System.out.println(secondLargest);

	}

}
