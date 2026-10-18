package hackerrank.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * HackerRank - Left Rotation (Easy)
 * https://www.hackerrank.com/challenges/array-left-rotation/problem
 */
public class LeftRotation {
	public static void main(String[] args) {
		System.out.println(rotateLeft(4, List.of(1, 2, 3, 4, 5))); // [5, 1, 2, 3, 4]
		System.out.println(rotateLeft(7, List.of(1, 2, 3, 4, 5))); // [3, 4, 5, 1, 2]
	}

	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		if (arr.isEmpty())
			return new ArrayList<>();
		d = d % arr.size(); // rotacionar n vezes volta ao início

		List<Integer> answer = new ArrayList<>();
		for (int i = d; i < arr.size(); i++) {
			answer.add(arr.get(i));
		}
		for (int i = 0; i < d; i++) {
			answer.add(arr.get(i));
		}
		return answer;

	}
}
