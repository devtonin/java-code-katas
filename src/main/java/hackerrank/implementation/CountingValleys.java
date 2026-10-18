package hackerrank.implementation;

/**
 * HackerRank - Counting Valleys (Easy)
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
public class CountingValleys {
	public static void main(String[] args) {
		System.out.println(countingValleys(8, "UDDDUDUU")); // 1
		System.out.println(countingValleys(12, "DDUUDDUDUUUD")); // 2
	}

	public static int countingValleys(int steps, String path) {
		int nivel = 0;
		int result = 0;

		for (int i = 0; i < steps; i++) {
			if (path.charAt(i) == 'U') {
				if (nivel == -1)
					result++;
				nivel++;
			}
			if (path.charAt(i) == 'D') {
				nivel--;
			}
		}
		return result;
	}
}
