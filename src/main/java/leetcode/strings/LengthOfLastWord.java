package leetcode.strings;

import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 58 - Length of Last Word (Easy)
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World")); // 5
		System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // 4
		System.out.println(lengthOfLastWord("luffy is still joyboy")); // 6
	}

	public static int lengthOfLastWord(String s) {
		String regex = "[,\\.\\s]";
		String[] myArray = s.split(regex);

		List<String> list = Arrays.asList(myArray);

		return list.getLast().length();
	}
}
