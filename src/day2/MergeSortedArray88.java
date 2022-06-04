package day2;

public class MergeSortedArray88 {
//    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
//    and two integers m and n,
//    representing the number of elements in nums1 and nums2 respectively.
//  Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int mergedArray[] = new int[m+n];
        int i = 0, j=0,k=0;

        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                mergedArray[k]=nums1[i];
                i++;
                k++;
            }else{
                mergedArray[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            mergedArray[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            mergedArray[k]=nums2[j];
            j++;
            k++;
        }
        for(int a = 0 ; a<nums1.length;a++){
            nums1[a] = mergedArray[a];
        }

    }
}
