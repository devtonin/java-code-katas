package leetcode.arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 2780 - Minimum Index of a Valid Split (Medium)
 * https://leetcode.com/problems/minimum-index-of-a-valid-split/
 */
public class MinimumIndexOfAValidSplit {

	public static void main(String[] args) {
		System.out.println(minimumIndex(java.util.Arrays.asList(1, 2, 2, 2))); // 2
		System.out.println(minimumIndex(java.util.Arrays.asList(2, 1, 3, 1, 1, 1, 7, 1, 2, 1))); // 4
		System.out.println(minimumIndex(java.util.Arrays.asList(3, 3, 3, 3, 7, 2, 2))); // -1
	}

	public static int minimumIndex(List<Integer> nums) {
		Map<Integer, Integer> firstMap = new HashMap<>();
		Map<Integer, Integer> secondMap = new HashMap<>();
		int n = nums.size();

		for (int num : nums) {
			secondMap.put(num, secondMap.getOrDefault(num, 0) + 1);
		}

		for (int index = 0; index < n; index++) {
			int num = nums.get(index);
			secondMap.put(num, secondMap.get(num) - 1);
			firstMap.put(num, firstMap.getOrDefault(num, 0) + 1);

			if (firstMap.get(num) * 2 > index + 1 && secondMap.get(num) * 2 > n - index - 1) {
				return index;
			}
		}

		return -1;
	}
}
