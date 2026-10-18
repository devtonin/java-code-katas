package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 118 - Pascal's Triangle (Easy)
 * https://leetcode.com/problems/pascals-triangle/
 */
public class PascalTriangle {

	public static void main(String[] args) {
		// [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
		System.out.println(new PascalTriangle().generate(5));
	}

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> tr = new ArrayList<>();

		for (int i = 0; i < numRows; i++) {
			tr.add(new ArrayList<>());
			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == i) { // se for a primeira camada e na segunda
					tr.get(i).add(1);
				} else {
					tr.get(i).add(tr.get(i - 1).get(j - 1) + tr.get(i - 1).get(j));
				}
			}
		}

		return tr;
	}

}
