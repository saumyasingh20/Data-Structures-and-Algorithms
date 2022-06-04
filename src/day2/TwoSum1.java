package day2;

import java.util.HashMap;

public class TwoSum1 {
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    You can return the answer in any order.
//
//
//
//            Example 1:
//
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//    Example 2:
//
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]
//    Example 3:
//
//    Input: nums = [3,3], target = 6
//    Output: [0,1]
//
//
//    Constraints:
//
//            2 <= nums.length <= 104
//            -109 <= nums[i] <= 109
//            -109 <= target <= 109
//    Only one valid answer exists.
    public int[] twoSum(int[] nums, int target) {
        //hashmap to store all the array elements and their indexes
        HashMap<Integer,Integer> map = new HashMap<>();
        //answer array to store the ans
        int[] ans = new int[2];
        //iterate over the array and for each arr[i] check if target-arr[i] exists in map

        for(int i = 0; i< nums.length;i++){

            if(map.containsKey(target-nums[i])){
                ans[0]=i;
                ans[1]= map.get(target-nums[i]);
                return ans;
                //if it does then store the index of both elements
            }
            //else put the array element and its index into hashmap
            map.put(nums[i],i);
        }


        //TIME COMPLEXITY = O(n) , SPACE COMPLEXITY = O(n)
        return ans;
    }
}
