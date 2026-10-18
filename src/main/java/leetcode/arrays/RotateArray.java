package leetcode.arrays;

/**
 * LeetCode 189 - Rotate Array (Medium)
 * https://leetcode.com/problems/rotate-array/
 */
public class RotateArray {

	public static void main(String[] args) {
		int k = 2;
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

		rotate(nums, k);
	}

	public static void rotate(int[] nums, int k) {
		int[] ans = new int[nums.length];
		nums = rotateArrayByK(nums, ans, k);
		for (int i : nums) {
			System.out.println(i);
		}
	}

	public static int[] rotateArrayByK(int[] nums, int[] ans, int k) {
		if (k == nums.length)
			return nums;
		if (k > nums.length)
			k = k % nums.length;
		int j = 0;
		for (int i = nums.length - k; i < nums.length; i++) {
			ans[j++] = nums[i];
		}
		for (int ii = 0; ii < nums.length - k; ii++) {
			ans[j++] = nums[ii];
		}

		for (int iii = 0; iii < nums.length; iii++) {
			nums[iii] = ans[iii];
		}

		return nums;
	}
}
