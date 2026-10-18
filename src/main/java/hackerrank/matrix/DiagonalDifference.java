package hackerrank.matrix;

import java.util.List;

/**
 * HackerRank - Diagonal Difference (Easy)
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference {
	public static void main(String[] args) {
		List<List<Integer>> arr = List.of(List.of(11, 2, 4), List.of(4, 5, 6), List.of(10, 8, -12));
		System.out.println(diagonalDifference(arr)); // 15
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		int leftSum = 0;
		int rightSum = 0;
		int n = arr.size();

		for (int i = 0; i < n; i++) {
			leftSum += arr.get(i).get(i);
			rightSum += arr.get(i).get(n - 1 - i);
		}

		return Math.abs(rightSum - leftSum);
	}
}
