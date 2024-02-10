package com.vault;

import java.util.Arrays;

/**
 * Given an unsorted array of integers nums, return the length of the longest
 * consecutive elements sequence. You must write an algorithm that runs in
 * O(n) time.
 * Example 1: Input: nums = [100,4,200,1,3,2] 
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].Therefore its length is 4.
 */
public class LongestConsecutive {

	public int longestConsecutive(int[] nums) {
		Arrays.sort(nums);
		int flag = 1;
		for (int i = 0; i < nums.length - 1; i++) { // Complexity O(n)
			if (nums[i] + 1 == nums[i + 1]) {
				flag++;
			}
		}

		return flag;
	}

	public static void main(String args[]) {
		int arr[] = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		System.out.println(new LongestConsecutive().longestConsecutive(arr));
	}

}
