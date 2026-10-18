package leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 39 - Combination Sum (Medium)
 * https://leetcode.com/problems/combination-sum/
 */
public class CombinationSum {
	public static void main(String[] args) {
		CombinationSum cs = new CombinationSum();
		System.out.println(cs.combinationSum(new int[] { 2, 3, 6, 7 }, 7)); // [[2, 2, 3], [7]]
		System.out.println(cs.combinationSum(new int[] { 2, 3, 5 }, 8)); // [[2, 2, 2, 2], [2, 3, 3], [3, 5]]
	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<>();

		Arrays.sort(candidates);

		backtrack(list, new ArrayList<>(), candidates, target, 0);

		return list;
	}

	public void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int remain, int start) {
		if (remain < 0)
			return;
		else if (remain == 0)
			list.add(new ArrayList<>(tempList));
		else {
			for (int i = start; i < candidates.length; i++) {
				tempList.add(candidates[i]);
				backtrack(list, tempList, candidates, remain - candidates[i], i);
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}
