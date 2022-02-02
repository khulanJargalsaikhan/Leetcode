package Tree;

import java.util.LinkedList;
import java.util.List;

import Tree.MaximumDepthOfBinaryTree.TreeNode;

/*
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * 	Input: root = [1,null,2,3]
	Output: [1,3,2]
 */

public class BinaryTreeInorderTraversal {


	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> mylist = new LinkedList<>();
		return inorderTraversal(root, mylist);
	}

	//helper method
	List<Integer> inorderTraversal(TreeNode root, List<Integer> mylist){

		if (root == null){
			return mylist;
		}
		// left node first, then root, right node at last.
		inorderTraversal(root.left, mylist);
		mylist.add(root.val);
		inorderTraversal(root.right, mylist);

		return mylist;
	}
}
