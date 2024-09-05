package arrayEasy;

public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		//return number of unique elements in array
		//two pointer approach
		//keep first pointer at 0th index since it would be always unique
		/*place second pointer at next position and iterate until you find
		 * an element different from element at pos i , place it at i+1 pos and do i+1
		 */
        int i = 0;
        for(int j = 1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        //since i would be at last unique index return i+1 to get total unique elements
        return i+1;
	}    
	
}
