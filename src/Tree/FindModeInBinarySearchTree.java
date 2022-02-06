package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindModeInBinarySearchTree {

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(1);
		tn.right = new TreeNode(2);
		tn.right.left = new TreeNode(2);

		System.out.println(Arrays.toString(findMode(tn)));

	}
	/*
	 * Given the root of a binary search tree (BST) with duplicates, return all the mode(s) 
	 * (i.e., the most frequently occurred element) in it.
If the tree has more than one mode, return them in any order.
Input: root = [1,null,2,2]
Output: [2]
	 */
	
	static int count = 1;
	static int max = 0;
	static Integer prev = null;

	public static int[] findMode(TreeNode root) {

		List<Integer> modeslist = new ArrayList<>();

		dfs(root, modeslist);

		int[] modesarr = new int[modeslist.size()];
		for (int i=0; i<modeslist.size(); i++) {
			modesarr[i] = modeslist.get(i);
		}

		return modesarr;
	}

	// using in-order tree traversal
	public static void dfs(TreeNode node, List<Integer> modeslist) {

		if (node == null)
			return;
		
		//left node visited first
		dfs(node.left, modeslist);


		if (prev != null) {
			if (prev == node.val){
				count++;
			} else {
				count = 1;
			}
		}
		
		if (count > max) {
			max = count;
			modeslist.clear();
			modeslist.add(prev);
		} else if (count == max) {
			modeslist.add(prev);
		}

		// root node visited next
		prev = node.val;

		// right node visited last
		dfs(node.right, modeslist);

	}





}
