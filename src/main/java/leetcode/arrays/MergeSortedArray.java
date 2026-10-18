package leetcode.arrays;

import java.util.Arrays;

/**
 * LeetCode 88 - Merge Sorted Array (Easy)
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		merge(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int size = m + n;
		int[] new_array = new int[size];

		for (int i = 0; i < m; i++) {
			if (nums1[i] != 0)
				new_array[i] = nums1[i];
		}

		for (int j = 0, k = m; j < n; j++, k++) {
			if (nums2[j] != 0)
				new_array[k] = nums2[j];
		}

		System.arraycopy(new_array, 0, nums1, 0, new_array.length);
		Arrays.sort(nums1);
	}
}
