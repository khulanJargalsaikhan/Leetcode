package Tree;

import java.util.ArrayList;
import java.util.List;

/*
 * Given the root of a binary tree, return all root-to-leaf paths in any order.
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
 */

public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {

		List<String> mylist = new ArrayList<>();
		if (root == null) return mylist;
		String currentPath = Integer.toString(root.val);

		if (root.left == null && root.right == null)
			mylist.add(currentPath);
		if (root.left != null)
			dfs(root.left, currentPath, mylist);
		if (root.right != null)
			dfs(root.right, currentPath, mylist);

		return mylist;
	}

	List<String> dfs(TreeNode node, String currentPath, List<String> mylist){
		currentPath = currentPath + "->" + node.val;

		if (node.left == null && node.right == null){
			mylist.add(currentPath);
			return mylist;
		}

		if (node.left != null)
			dfs(node.left, currentPath, mylist);

		if (node.right != null)
			dfs(node.right, currentPath, mylist);

		return mylist;
	}
}
