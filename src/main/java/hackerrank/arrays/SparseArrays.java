package hackerrank.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * HackerRank - Sparse Arrays (Medium)
 * https://www.hackerrank.com/challenges/sparse-arrays/problem
 */
public class SparseArrays {
	public static void main(String[] args) {
		List<String> strings = List.of("ab", "ab", "abc");
		List<String> queries = List.of("ab", "abc", "bc");
		System.out.println(matchingStrings(strings, queries)); // [2, 1, 0]
	}

	public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {

		List<Integer> answer = new ArrayList<>();
		for (int i = 0; i < queries.size(); i++) {
			int sum = 0;
			for (String x : stringList) {
				if (x.equals(queries.get(i))) {
					sum++;
				}
			}
			answer.add(sum);
		}
		return answer;
	}
}
