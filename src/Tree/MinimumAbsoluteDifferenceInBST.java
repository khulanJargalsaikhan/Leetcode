package Tree;
/*
 * Given the root of a Binary Search Tree (BST), return the minimum absolute difference between 
 * the values of any two different nodes in the tree.
Input: root = [4,2,6,1,3]
Output: 1
 */
public class MinimumAbsoluteDifferenceInBST {

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(4);
		tn.left = new TreeNode(2);
		tn.right = new TreeNode(6);
		tn.left.left = new TreeNode(1);
		tn.left.right = new TreeNode(3);
		
		System.out.println(getMinimumDifference(tn));

	}

	static int min = Integer.MAX_VALUE;
	static Integer prev = null;

	public static int getMinimumDifference(TreeNode root) {

		if (root == null)
			return min;

		getMinimumDifference(root.left);

		if (prev != null)
			min = Math.abs(Math.min(min, root.val - prev));

		prev = root.val;

		getMinimumDifference(root.right);


		return min;

	}

}
