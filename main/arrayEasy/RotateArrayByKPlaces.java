package arrayEasy;

import java.util.Iterator;

public class RotateArrayByKPlaces {
	
	public static int[] rotateArray(int[]arr, int k) {
		
		//new index = (currentIndex + k )% n
		
		int n = arr.length;
		int[] temp = new int[n];
		for(int i =0;i<n;i++) {
			temp[i] = arr[(i+k)%n];
		}
		return temp;
		
	}
	public static void main(String[] args) {
		
		int arr[]= new int[] {10,20,30,40,60};
		int[] rotatedArray = rotateArray(arr, 2);
		for(int i =0;i<rotatedArray.length;i++) {
			System.out.println(rotatedArray[i]);
		}
	}

}
