package leetcode.trees;

/**
 * LeetCode 700 - Search in a Binary Search Tree (Easy)
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 */
public class SearchInBinaryTree {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);

		TreeNode found = searchBST(root, 2);
		System.out.println(found.val + " -> filhos: " + found.left.val + ", " + found.right.val);
		System.out.println(searchBST(root, 5)); // null
	}

	public static TreeNode searchBST(TreeNode root, int val) {
		if (root == null || root.val == val) {
			return root;
		}
		if (val < root.val) {
			return searchBST(root.left, val);
		} else {
			return searchBST(root.right, val);
		}
	}

}
