package com.vault;

import java.util.HashMap;

/**
 * Given an integer array nums and an integer k, return the k most frequent
 * elements. You may return the answer in any order.
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2 
 * Output: [1,2]
 */
public class TopKFrequent {

	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	public int[] topKFrequent(int[] nums, int k) {
		int output[] = new int[k];
		for(int i=0;i<nums.length;i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}else {
				map.put(nums[i], map.get(nums[i])+1);
			}
			 
		}
		map.forEach((key, value) -> System.out.println(key + " " + value));
		
		return output;
	}
	
	public static void main(String args[]) {
		int arr[] = { 1,1,1,2,2,3};
		System.out.println(new TopKFrequent().topKFrequent(arr, 2));
	}


}
