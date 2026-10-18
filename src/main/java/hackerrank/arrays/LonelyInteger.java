package hackerrank.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * HackerRank - Lonely Integer (Easy)
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-lonely-integer/problem
 * Todos os elementos aparecem duas vezes, exceto um.
 */
public class LonelyInteger {

	public static int lonelyInteger(List<Integer> a) {
		int valor = 0;

		for (int n : a) {
			valor ^= n;
		}

		return valor;
	}

	public static void main(String args[]) {
		List<Integer> a = new ArrayList<>();

		a.add(1);
		a.add(1);

		a.add(4);

		a.add(13);
		a.add(13);

		int r = lonelyInteger(a);

		System.out.println(r); // 4
	}

}
