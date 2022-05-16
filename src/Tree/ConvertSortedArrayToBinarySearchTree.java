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

		return constructTreeFromArray(nums, 0, nums.length-1);

	}

	TreeNode constructTreeFromArray(int[] nums, int start, int end){
		/* index    0   1 2 3 4 
		 * nums = [-10,-3,0,5,9]
		 */
		if (end < start) return null;

		int mid = (start + end)/2;  // mid is root node
		TreeNode root = new TreeNode(nums[mid]);
		root.left = constructTreeFromArray(nums, start, mid-1); //this recursion will build left side
		root.right = constructTreeFromArray(nums, mid+1, end); //this recursion will build right side

		return root;
	}
}
