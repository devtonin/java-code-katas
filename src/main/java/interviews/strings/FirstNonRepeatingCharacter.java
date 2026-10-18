package interviews.strings;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		System.out.println(firstNonRepeating("geeksforgeeks")); // 6 ('f')
		System.out.println(firstNonRepeating("aabbcc")); // -1
		System.out.println(firstNonRepeating("Java")); // 1 ('J')
	}

	static int firstNonRepeating(String str) {
		int[] count = new int[256];

		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i) % 256]++;

		int index = -1;

		for (int i = 0; i < str.length(); i++) {
			if (count[str.charAt(i) % 256] == 1) {
				index = i + 1;
				break;
			}
		}

		return index;
	}
}
