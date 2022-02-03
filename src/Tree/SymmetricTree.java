package Tree;

public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
Input: root = [1,2,2,3,4,4,3]
Output: true

Input: root = [1,2,2,null,3,null,3]
Output: false
	 */

	public boolean isSymmetric(TreeNode root) {
		// if root is empty, then technically it is symmetric
		if (root == null) return true;

		// recursive solution
		return isSymmetric(root.left, root.right);
	}

	boolean isSymmetric(TreeNode left, TreeNode right){
		
		//if left or right is null, then let's check left and right are equal
		if (left == null || right == null){
			return left == right; 
		}

		if (left.val != right.val){
			return false;
		}
		
		return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
	}

}
