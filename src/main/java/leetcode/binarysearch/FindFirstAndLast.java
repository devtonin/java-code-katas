package leetcode.binarysearch;

import java.util.Arrays;

/**
 * LeetCode 34 - Find First and Last Position of Element in Sorted Array
 * (Medium)
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class FindFirstAndLast {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8))); // [3, 4]
		System.out.println(Arrays.toString(searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 6))); // [-1, -1]
		System.out.println(Arrays.toString(searchRange(new int[] {}, 0))); // [-1, -1]
	}

	public static int[] searchRange(int[] nums, int target) {
		return new int[] { binarySearch(nums, target, true), binarySearch(nums, target, false) };
	}

	private static int binarySearch(int[] nums, int target, boolean first) {
		int low = 0;
		int high = nums.length - 1;
		int found = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] == target) {
				found = mid;
				if (first) {
					high = mid - 1; // array é cortado: continua na metade esquerda
				} else {
					low = mid + 1; // continua na metade direita
				}
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else { // arr[mid] < target
				low = mid + 1;
			}
		}
		return found;
	}
}
