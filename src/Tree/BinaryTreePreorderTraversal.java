package Tree;

import java.util.LinkedList;
import java.util.List;

/*
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
Input: root = [1,null,2,3]
Output: [1,2,3]
 */

public class BinaryTreePreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> mylist = new LinkedList<>();
		preorderTraversal(root, mylist);
		return mylist;
	}

	public List<Integer> preorderTraversal(TreeNode root, List<Integer> mylist){
		if (root == null) 
			return mylist;
		mylist.add(root.val);
		preorderTraversal(root.left, mylist);
		preorderTraversal(root.right, mylist);

		return mylist;
	}
}
