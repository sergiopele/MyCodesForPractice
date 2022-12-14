package questionPartPractice;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public static void main(String[] args) {
		int[]num= {2,2,1};
		System.out.println(singleNumber(num));
	}
	public static int singleNumber(int[] nums) {
		Map<Integer, Integer> duplicate = new HashMap<>();
		int result = 0;
		int count = 1;
		for (int i = 0; i < nums.length; i++) {
			if (duplicate.get(i)==null) {
				duplicate.put(nums[i], count++);
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (duplicate.get(i)!=null) {
				duplicate.put(nums[i], count++);
			}else{
				duplicate.put(nums[i],count);
			}
		}
		
		for (Map.Entry<Integer, Integer> dup : duplicate.entrySet()) {
			if (dup.getValue() ==1) {
				result = dup.getKey();
				//break;
			}
		}
		
		
		return result;
		
	}
}