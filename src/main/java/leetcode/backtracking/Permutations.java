package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 46 - Permutations (Medium)
 * https://leetcode.com/problems/permutations/
 */
public class Permutations {
	public static void main(String[] args) {
		// [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 2, 1], [3, 1, 2]]
		System.out.println(new Permutations().permute(new int[] { 1, 2, 3 }));
	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		backtrack(nums, 0, list);
		return list;
	}

	public void backtrack(int[] nums, int index, List<List<Integer>> list) {
		if (index == nums.length) {
			List<Integer> ds = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				ds.add(nums[i]);
			}
			list.add(ds);
			return;
		}

		for (int i = index; i < nums.length; i++) {
			int temp = nums[i];
			nums[i] = nums[index];
			nums[index] = temp;

			backtrack(nums, index + 1, list);

			temp = nums[i];
			nums[i] = nums[index];
			nums[index] = temp;
		}
	}
}
