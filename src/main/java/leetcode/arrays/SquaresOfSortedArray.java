package leetcode.arrays;

import java.util.Arrays;

/**
 * LeetCode 977 - Squares of a Sorted Array (Easy)
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresOfSortedArray {
	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
		System.out.println(Arrays.toString(sortedSquares(nums))); // [0, 1, 9, 16, 100]
	}

	public static int[] sortedSquares(int[] nums) {
		return Arrays.stream(nums).map(num -> num * num).sorted().toArray();
	}
}
