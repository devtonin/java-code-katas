package leetcode.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 144 - Binary Tree Preorder Traversal (Easy)
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class BinaryTreePreorderTraversal {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
		System.out.println(new BinaryTreePreorderTraversal().preorderTraversal(root)); // [1, 2, 3]
	}

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		traverseRead(root, list);
		return list;
	}

	public void traverseRead(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}

		list.add(root.val);
		traverseRead(root.left, list);
		traverseRead(root.right, list);
	}
}
