package Tree;
/*
 * Given the root of a binary tree, return the sum of all left leaves.
Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
 */
public class SumofLeftLeaves {
	int sum = 0;

	public int sumOfLeftLeaves(TreeNode root) {

		if (root == null)
			return 0;

		if (root.left != null && root.left.left == null && root.left.right == null)
			sum += root.left.val;

		sumOfLeftLeaves(root.left);
		sumOfLeftLeaves(root.right);

		return sum;
	}
}
