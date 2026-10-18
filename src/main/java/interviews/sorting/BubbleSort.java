package interviews.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] array) {
		boolean swapped = true;
		int j = 0;
		int tmp;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[i + 1]) {
					tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
					swapped = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 8, 0, -3 };
		bubbleSort(array);
		System.out.println(Arrays.toString(array)); // [-3, 0, 1, 2, 4, 5, 8]
	}
}
