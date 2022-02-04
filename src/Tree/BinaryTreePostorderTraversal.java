package Tree;

import java.util.LinkedList;
import java.util.List;
/*
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
Input: root = [1,null,2,3]
Output: [3,2,1]
 */
public class BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {

		List<Integer> mylist = new LinkedList<>();
		postorderTraversal(root, mylist);
		return mylist;

	}

	public List<Integer> postorderTraversal(TreeNode root, List<Integer> mylist){
		if (root == null)
			return mylist;

		postorderTraversal(root.left, mylist);
		postorderTraversal(root.right, mylist);
		mylist.add(root.val);

		return mylist;
	}
}
