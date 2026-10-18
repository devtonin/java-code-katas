package leetcode.arrays;

/**
 * LeetCode 605 - Can Place Flowers (Easy)
 * https://leetcode.com/problems/can-place-flowers/
 */
public class CanPlaceFlowers {
	public static void main(String[] args) {
		int[] flowerbed = { 1, 0, 0, 0, 1 };
		boolean cPf = canPlaceFlowers(flowerbed, 1);
		if (cPf) {
			System.out.println("Pode plantar");
		} else {
			System.out.println("Não pode plantar");
		}

		System.out.println(canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 2)); // false
		System.out.println(canPlaceFlowers(new int[] { 0, 0, 1, 0, 0 }, 2)); // true
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int tamanho = flowerbed.length;
		int plantadas = 0;

		for (int i = 0; i < tamanho && plantadas < n; i++) {
			boolean esquerdaVazia = i == 0 || flowerbed[i - 1] == 0;
			boolean direitaVazia = i == tamanho - 1 || flowerbed[i + 1] == 0;

			if (flowerbed[i] == 0 && esquerdaVazia && direitaVazia) {
				flowerbed[i] = 1;
				plantadas++;
			}
		}

		return plantadas >= n;
	}
}
