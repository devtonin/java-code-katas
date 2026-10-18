package leetcode.arrays;

import java.util.Arrays;

/**
 * LeetCode 26 - Remove Duplicates from Sorted Array (Easy)
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int[] expectedNums = { 0, 1, 2, 3, 4 };

		int k = removeDuplicates(nums);

		boolean ok = k == expectedNums.length && Arrays.equals(Arrays.copyOf(nums, k), expectedNums);

		System.out.println("k = " + k + " -> " + Arrays.toString(Arrays.copyOf(nums, k))); // k = 5 -> [0, 1, 2, 3, 4]
		System.out.println(ok ? "OK" : "FALHOU");
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;

		int i = 1;

		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i - 1]) {
				nums[i] = nums[j];
				i++;
			}
		}

		return i;
	}
}
