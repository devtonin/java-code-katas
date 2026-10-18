package leetcode.arrays;

import java.util.Arrays;

/**
 * LeetCode 27 - Remove Element (Easy)
 * https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int k = removeElement(nums, 2);
		System.out.println("k = " + k + " -> " + Arrays.toString(Arrays.copyOf(nums, k))); // k = 5 -> [0, 1, 3, 0, 4]
	}

	public static int removeElement(int[] nums, int val) {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[temp] = nums[i];
				temp++;
			}
		}
		return temp;
	}
}
