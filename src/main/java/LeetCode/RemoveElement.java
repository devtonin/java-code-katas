package LeetCode;

public class RemoveElement {
	public static void main(String[] args) {
	}

	public int removeElement(int[] nums, int val) {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[temp] = nums[i];
				temp++;
			}
		}
		return temp;
	}
}
