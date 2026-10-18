package leetcode.strings;

import java.util.List;

/**
 * LeetCode 1768 - Merge Strings Alternately (Easy)
 * https://leetcode.com/problems/merge-strings-alternately/
 */
public class MergeStringsAlternately {
	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "pqrs";

		String merged = mergeAlternately(s1, s2);
		System.out.println(merged);
	}

	public static String mergeAlternately(String word1, String word2) {
		List<String> list1 = List.of(word1.split(""));
		List<String> list2 = List.of(word2.split(""));
		StringBuilder builder = new StringBuilder();
		int size = 0;

		if (list1.size() == list2.size())
			size = list1.size();
		else
			size = (Math.max(list1.size(), list2.size()));

		for (int i = 0; i < size; i++) {
			if (i < list1.size())
				builder.append(list1.get(i));
			if (i < list2.size())
				builder.append(list2.get(i));
		}

		return builder.toString();
	}
}
