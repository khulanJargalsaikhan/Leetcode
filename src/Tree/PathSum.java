package Tree;

import java.util.Stack;

public class PathSum {

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(5);
		tn.left = new TreeNode(4);
		tn.right = new TreeNode(8);
		tn.left.left = new TreeNode(11);
		tn.right.left = new TreeNode(13);
		tn.right.right = new TreeNode(4);
		tn.left.left.left = new TreeNode(7);
		tn.left.left.right = new TreeNode(2);
		tn.right.right.right = new TreeNode(1);
		
		System.out.println(hasPathSum(tn, 22));

	}
	/*
	 * Given the root of a binary tree and an integer targetSum, return true if the tree 
	 * has a root-to-leaf path such that adding up all the values along the path equals targetSum.
	 * 
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.
	 */

	
	// ITERATIVE solution
	static boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null)
			return false;

		Stack<TreeNode> nodeStack = new Stack<>();
		Stack<Integer> sumStack = new Stack<>();

		nodeStack.add(root);
		sumStack.add(targetSum - root.val);

		while (!nodeStack.isEmpty()){
			TreeNode currentNode = nodeStack.pop();
			int currentSum = sumStack.pop();

			//reaches leaf node and checks sum == 0
			if (currentNode.left == null && currentNode.right == null && currentSum == 0)
				return true;

			if (currentNode.left != null){
				nodeStack.add(currentNode.left);
				sumStack.add(currentSum - currentNode.left.val);
			}

			if (currentNode.right != null){
				nodeStack.add(currentNode.right);
				sumStack.add(currentSum - currentNode.right.val);
			}
		}

		return false;




	}
}
