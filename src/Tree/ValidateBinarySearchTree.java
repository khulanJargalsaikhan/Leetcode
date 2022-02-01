package Tree;

import Tree.MaximumDepthOfBinaryTree.TreeNode;

/*
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:
-The left subtree of a node contains only nodes with keys less than the node's key.
-The right subtree of a node contains only nodes with keys greater than the node's key.
-Both the left and right subtrees must also be binary search trees.
Input: root = [2,1,3]
Output: true

Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
 */
public class ValidateBinarySearchTree {
	 public boolean isValidBST(TreeNode root) {
		 
		 if (root == null) return true;
		 
		 return validateBST(root, null, null);
	 }
	 
	 public boolean validateBST(TreeNode root, Integer low, Integer high) {
		 
		 // empty tree is valid BST. 
		 if (root == null) return true;
		 
		 // The current node's value must be between low and high.
		 if ((low != null && root.val <= low) || (high != null && root.val >= high)) return false;
		 
		 // validate left and right sides recursively
		 // root.val => highest in the left subtree                  root.val => lowest in the right subtree
		 return validateBST(root.left, low, root.val) && validateBST(root.right, root.val, high);
	 }
	
}
