package leetcode.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LeetCode 2215 - Find the Difference of Two Arrays (Easy)
 * https://leetcode.com/problems/find-the-difference-of-two-arrays/
 */
public class FindDifferenceBetweenTwoArrays {
	public static void main(String[] args) {
		int[] nums1 = new int[] { 1, 2, 3 };
		int[] nums2 = new int[] { 2, 4, 6 };

		List<List<Integer>> list = findDifference(nums1, nums2);

		for (List<Integer> l : list) {
			for (Integer v : l) {
				System.out.println(v);
			}
		}
	}

	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int n : nums1)
			set1.add(n);
		for (int n : nums2)
			set2.add(n);

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<List<Integer>> finalList = new ArrayList<>();
		for (int i : set1) {
			if (!set2.contains(i))
				list1.add(i);
		}
		for (int j : set2) {
			if (!set1.contains(j))
				list2.add(j);

		}
		finalList.add(list1);
		finalList.add(list2);
		return finalList;
	}
}
