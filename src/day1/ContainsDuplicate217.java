package day1;

import java.util.HashSet;
import java.util.Set;
public class ContainsDuplicate217 {
//    Given an integer array nums, return true if any value appears at least twice in the array,
//    and return false if every element is distinct.
//
//    Example 1:
//
//    Input: nums = [1,2,3,1]
//    Output: true
//    Example 2:
//
//    Input: nums = [1,2,3,4]
//    Output: false
//    Example 3:
//
//    Input: nums = [1,1,1,3,3,4,3,2,4,2]
//    Output: true
//
//    Constraints:
//
//            1 <= nums.length <= 105
//            -109 <= nums[i] <= 109

        public boolean containsDuplicate(int[] nums) {
            Set<Integer> isUnique = new HashSet<>();

            //adding all the elements of the array to the set
            for(int i:nums)
                isUnique.add(i);
            //duplicate elements will be automatically discarded,
            // so if no. of elements in set = total numbers in array then all are unique so return false
            if(isUnique.size()==(nums.length))
                return false;

            return true;
        }

}
