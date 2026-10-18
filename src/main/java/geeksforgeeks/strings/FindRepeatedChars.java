package geeksforgeeks.strings;

/**
 * GeeksforGeeks - Find repeated characters in a string Retorna quantos
 * caracteres distintos aparecem mais de uma vez.
 */
public class FindRepeatedChars {
	static final int NO_OF_CHARS = 256;

	public static void main(String[] args) {
		System.out.println(findRepeated("geeksforgeeks")); // 4 (g, e, k, s)
		System.out.println(findRepeated("abcd")); // 0
		System.out.println(findRepeated("aabbcc")); // 3
	}

	static int[] getCharCountArray(String str) {
		int[] count = new int[NO_OF_CHARS];
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i) % NO_OF_CHARS]++;
		return count;
	}

	static int findRepeated(String str) {
		int[] count = getCharCountArray(str);
		int sum = 0;

		for (int c : count) {
			if (c > 1) {
				sum++;
			}
		}

		return sum;
	}
}
