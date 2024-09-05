package arrayEasy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

//Hashmap
public class FourSum {
	
	private static Map<Integer, List<int[]>> printPairSum(List<Integer> nums) {
		Map<Integer, List<int[]>> map = new HashMap<>();
		int n = nums.size();
		for(int i = 0;i<n-1;i++) {
			for(int k = i+1 ; k<n ; k++) {
				int sum = nums.get(i)+ nums.get(k);
				map.putIfAbsent(sum, new ArrayList<>());
				map.get(sum).add(new int[] {i,k});
			}
		}
		return map;
		
	}
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        
        int n = nums.length;
        //check if length < 4
        if(n<4) return new ArrayList<>();

        //sort to avoid duplicate
        Arrays.sort(nums);

        //store all the sum of all pairs
        Map<Integer,List<int[]>> pairSums = new HashMap<>();

        //traverse the array and store pair sums
        // i will go from 0 to n-2 (i.e second last element because it is first index)
        //  k will go from 0 to n-1 (i.e last element because it is our second index)

        for(int i = 0; i <= n-2 ; i++){
            for(int k = i+1; k<=n-1; k++){
                int sum = nums[i] + nums[k];
                pairSums.putIfAbsent(sum,new ArrayList<>());
                pairSums.get(sum).add(new int[]{i,k});
            }
        }

        //set to sore unique quadruples
        Set<List<Integer>> uniqueQuadruples = new HashSet<>();

        //find complement
        for(int i = 0; i <= n-2 ; i++){
            for(int k = i+1; k<=n-1; k++){
                int complement = target - (nums[i] + nums[k]);
                if(pairSums.containsKey(complement)){
                   for(int[] otherPair: pairSums.get(complement)) {
                       int l = otherPair[0];
                       int m = otherPair[1];
                       //check l > k to check we are on different index
                       if(l>k){
                           uniqueQuadruples.add(List.of(nums[i],nums[k],nums[l],nums[m]));
                       }
                   }
                }
            }
        }

        return new ArrayList<>(uniqueQuadruples);
	}
	
	public static void main(String[] args) {
//		Map<Integer,List<int[]>>pairSum= printPairSum(List.of(1,2,3,4,5));
//		for(Entry<Integer, List<int[]>> entry : pairSum.entrySet()) {
//			System.out.print("sum = " + entry.getKey());
//			System.out.print(" pair = " + entry.getValue().get(0)[0] + " , " + entry.getValue().get(0)[1]);
//			System.out.println();
//		}
		
		List<List<Integer>> fourSumRes = fourSum(new int[] {2,2,2,2,2},8);
		System.out.print(fourSumRes);
	}

	

}
