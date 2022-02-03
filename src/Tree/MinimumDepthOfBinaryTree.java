package Tree;
/*
 * Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
Input: root = [3,9,20,null,null,15,7]
Output: 2

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5
 */
public class MinimumDepthOfBinaryTree {
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		else if(root.left == null)
			return 1 + minDepth(root.right);
		else if(root.right == null)
			return 1 + minDepth(root.left);
		else
			return 1 + Math.min(minDepth(root.right), minDepth(root.left));

	}
}
