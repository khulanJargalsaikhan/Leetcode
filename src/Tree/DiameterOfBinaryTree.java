package Tree;

public class DiameterOfBinaryTree {

	// Driver Code
	public static void main(String args[])
	{
		// creating a binary tree and entering the nodes
		// diameter through root
		TreeNode tn = new TreeNode(1);
		tn.left = new TreeNode(2);
		tn.right = new TreeNode(3);
		tn.left.left = new TreeNode(4);
		tn.left.right = new TreeNode(5);

		// Function Call
		//System.out.println( "The length of the diameter of given binary tree is : " + diameterOfBinaryTree(tn));
		
		// diameter not through root example
		TreeNode tn2 = new TreeNode(1);
		tn2.left = new TreeNode(2);
		tn2.right = new TreeNode(3);
		tn2.left.left = new TreeNode(4);
		tn2.left.right = new TreeNode(5);
		tn2.left.left.left = new TreeNode(6);
		tn2.left.left.right = new TreeNode(7);
		tn2.left.right.right = new TreeNode(8);
		tn2.left.left.right.left = new TreeNode(9);
		tn2.left.right.right.left = new TreeNode(10);
		tn2.left.right.right.right = new TreeNode(11);
		tn2.left.left.right.left.right = new TreeNode(12);
		tn2.left.right.right.right.left = new TreeNode(13);
		
		System.out.println( "The length of the diameter of given binary tree is : " + diameterOfBinaryTree(tn2));
	}

/*
 * Given the root of a binary tree, return the LENGTH of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree. 
This path may or may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
 */

	static int max = 0;

	public static int diameterOfBinaryTree(TreeNode root) {
		maxDepth(root);
		return max;
	}

	private static int maxDepth(TreeNode root) {
		if (root == null) return 0;

		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		max = Math.max(max, left + right);

		return Math.max(left, right) + 1;
	}

}
