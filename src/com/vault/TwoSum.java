package com.vault;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order. 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9 
 * Output: [0,1] 
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {

	int output[] = new int[2];

	public int[] twoSum(int[] nums, int target) {
		if (nums.length <= 0)
			return output;

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) { // Complexity n^2
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
					return output;
				}
			}
		}
		return output;
	}

	public static void main(String args[]) {
		int arr[] = { 3, 3 };
		System.out.println(Arrays.toString(new TwoSum().twoSum(arr, 6)));
	}

}
