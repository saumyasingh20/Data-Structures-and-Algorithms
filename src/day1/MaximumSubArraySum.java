package day1;
//Kadane's Algorithm
public class MaximumSubArraySum {
//    Given an integer array nums, find the contiguous subarray (containing at least one number) which
//    has the largest sum and return its sum.
//
//    A subarray is a contiguous part of an array.
//
//    Example 1:
//
//    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//    Output: 6
//    Explanation: [4,-1,2,1] has the largest sum = 6.
//    Example 2:
//
//    Input: nums = [1]
//    Output: 1
//    Example 3:
//
//    Input: nums = [5,4,-1,7,8]
//    Output: 23
//
//
//    Constraints:
//
//            1 <= nums.length <= 105
//            -104 <= nums[i] <= 104
//
//
//    Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach,
//    which is more subtle.
    public int maxSubArray(int[] arr) {


        //update current sum and overall best sum with the first element of the array
        int currentSum = arr[0];
        int overallBestSum = arr[0];

        //start with the second element of the array
        //check if the previous sum is positive then add yourself to it
        //else if the previous sum is negative then start a new subArray by adding yourself to the current sum

        for(int i = 1; i<arr.length;i++){
            if(currentSum >=0){
                currentSum += arr[i];
            }else{
                currentSum = arr[i];
            }
            //update overall Best sum with current sum if it is smaller than current sum
            if(currentSum > overallBestSum){
                overallBestSum = currentSum;
            }
        }
        return overallBestSum;


    }
}
