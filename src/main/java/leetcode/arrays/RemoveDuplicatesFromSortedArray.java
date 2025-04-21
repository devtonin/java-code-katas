package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int[] expectedNums = {0,1,2,3,4};

		int k = removeDuplicates(nums);

		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
			assert nums[i] == expectedNums[i];
		}
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) return 0;

		int i = 1;

		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i - 1]) {
				nums[i] = nums[j];
				i++;
			}
		}

		List<Integer> test = new ArrayList<>();
		for (int k : nums) {
			test.add(nums[k]);
		}
		System.out.println(test);

		return i;
	}
}
