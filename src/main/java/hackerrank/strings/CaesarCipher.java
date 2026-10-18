package hackerrank.strings;

/**
 * HackerRank - Caesar Cipher (Easy)
 * https://www.hackerrank.com/challenges/caesar-cipher-1/problem Desloca cada
 * letra k posições no alfabeto (com volta de 'z' para 'a'), preservando
 * maiúsculas/minúsculas. Qualquer outro caractere permanece igual.
 */
public class CaesarCipher {

	public static String caesarCipher(String s, int k) {
		int shift = k % 26;
		StringBuilder encrypted = new StringBuilder(s.length());

		for (int i = 0; i < s.length(); i++) {
			encrypted.append(rotate(s.charAt(i), shift));
		}
		return encrypted.toString();
	}

	private static char rotate(char c, int shift) {
		if (c >= 'a' && c <= 'z')
			return (char) ('a' + (c - 'a' + shift) % 26);
		if (c >= 'A' && c <= 'Z')
			return (char) ('A' + (c - 'A' + shift) % 26);
		return c;
	}

	public static void main(String args[]) {
		String s = "middle-Outz";

		System.out.println(caesarCipher(s, 2)); // okffng-Qwvb
		System.out.println(caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5)); // Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj
	}
}
