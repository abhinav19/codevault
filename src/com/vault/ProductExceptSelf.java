package com.vault;

import java.util.Arrays;

/**
 * Given an integer array nums, return an array answer such that answer[i] is
 * equal to the product of all the elements of nums except nums[i]. 
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
 * integer. 
 * You must write an algorithm that runs in O(n) time and without using the
 * division operation. 
 * Example 1:
 * Input: nums = [1,2,3,4] 
 * Output: [24,12,8,6]
 */
public class ProductExceptSelf {

	public int[] productExceptSelf(int[] nums) {
		int output[] = new int[nums.length];
		int flag = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) { // Complexity n^2
				if (i != j)
					flag = flag * nums[j];
			}
			output[i] = flag;
			;
			flag = 1;
		}

		return output;
	}

	public static void main(String args[]) {
		int arr[] = { -1, 1, 0, -3, 3 };
		System.out.println(Arrays.toString(new ProductExceptSelf().productExceptSelf(arr)));
	}

}
