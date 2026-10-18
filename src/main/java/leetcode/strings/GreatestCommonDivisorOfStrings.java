package leetcode.strings;

/**
 * LeetCode 1071 - Greatest Common Divisor of Strings (Easy)
 * https://leetcode.com/problems/greatest-common-divisor-of-strings/
 */
public class GreatestCommonDivisorOfStrings {
	public static void main(String[] args) {
		System.out.println(gcdOfStrings("ABCABC", "ABC")); // ABC
		System.out.println(gcdOfStrings("ABABAB", "ABAB")); // AB
		System.out.println(gcdOfStrings("LEET", "CODE")); // "" (vazio)
	}

	public static String gcdOfStrings(String str1, String str2) {
		if (!(str1 + str2).equals(str2 + str1))
			return "";

		return str1.substring(0, gcd(str1.length(), str2.length()));
	}

	private static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
