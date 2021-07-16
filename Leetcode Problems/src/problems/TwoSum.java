package problems;

import java.util.HashMap;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
        	if (map.containsKey(diff)) {
        			return new int[] {map.get(diff), i};
        	}
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match found");
	}	
	public static void main(String[] args) {
		
		int[] nums = {2, 3, 4, 5, 7, 8, 9, 6};
		
		System.out.println(twoSum(nums, 5));
	}
}	

