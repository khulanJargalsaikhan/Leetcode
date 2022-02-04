package Tree;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Given the root of a binary tree, invert the tree, and return its root.
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
 */
public class InvertBinaryTree {

	// resursive solution
	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return root;

		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;

		invertTree(root.right);
		invertTree(root.left);

		return root;
	}



	//iterative solution
	public TreeNode invertTree2(TreeNode root) {
		if (root == null)
			return root;

		Queue<TreeNode> myqueue = new LinkedList<>();
		myqueue.add(root);

		while( !myqueue.isEmpty() ) {
			TreeNode curr = myqueue.poll();
			TreeNode temp = curr.left;
			curr.left = curr.right;
			curr.right = temp;

			if (curr.left != null)
				myqueue.add(curr.left);
			if (curr.right != null)
				myqueue.add(curr.right);
		}

		return root;
	}
}
