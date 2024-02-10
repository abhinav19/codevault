package com.vault;

/**
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct. Example 1:
 * Input: nums = [1,2,3,1] Output: true
 */
public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {
		if (nums.length <= 0)
			return false;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) { // Complexity n^2

				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4 };
		System.out.println(new ContainsDuplicate().containsDuplicate(arr));
	}

}
