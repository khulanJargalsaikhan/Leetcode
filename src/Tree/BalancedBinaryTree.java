package Tree;

/*
 * Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as:
a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
Input: root = [3,9,20,null,null,15,7]
Output: true
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
 */

public class BalancedBinaryTree {
	
	public static void main(String[] args) {
		TreeNode tn = new TreeNode(3);
		tn.left = new TreeNode(9);
		tn.right = new TreeNode(20);
		tn.right.left = new TreeNode(15);
		tn.right.right = new TreeNode(7);
		
		if (BalancedBinaryTree.isBalanced(tn))
			System.out.println("this tree is balanced");
		else
			System.out.println(" not balanced ");
	}
	
	
	
	static boolean bal = true;

	public static boolean isBalanced(TreeNode root) {

		if (root == null) return true;

		depth(root);
		return bal;

	}

	//helper
	static int depth(TreeNode root){

		if (root == null)
			return 0;

		//calculating depth of left subtree
		int leftSubtree = depth(root.left);
		int rightSubtree = depth(root.right);

		if (Math.abs(leftSubtree - rightSubtree) > 1)
			bal = false;

		return 1+Math.max(leftSubtree, rightSubtree);
	}
}
