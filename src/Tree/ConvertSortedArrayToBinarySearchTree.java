package Tree;

/*
 * Given an integer array nums where the elements are sorted in ascending order, 
 * convert it to a height-balanced binary search tree.
A height-balanced binary tree is a binary tree in which the depth of the two subtrees 
of every node never differs by more than one.
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted
 */
public class ConvertSortedArrayToBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums){ 

		if (nums == null || nums.length == 0)
			return null;

		return constructTreeFromArray(nums, 0, nums.length-1);

	}

	TreeNode constructTreeFromArray(int[] nums, int left, int right){

		if (left > right) return null;

		int mid = (right-left)/2 + left;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = constructTreeFromArray(nums, left, mid-1);
		node.right = constructTreeFromArray(nums, mid+1, right);

		return node;
	}
}
