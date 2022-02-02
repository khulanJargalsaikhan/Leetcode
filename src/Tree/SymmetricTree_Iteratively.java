package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree_Iteratively {

	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree( new Node(1) );
		bt.root.left = new Node(2);
		bt.root.right = new Node(2);
		bt.root.left.left = new Node(1);
		bt.root.left.right = new Node(4);
		bt.root.right.left = new Node(4);
		bt.root.right.right = new Node(1);

		if (bt.isSymmetric(bt.root)) {
			System.out.println("This tree is symmetric");
		} else
			System.out.println("This tree is NOT symmetric!");
	}





}

//Node class
class Node{
	int val;
	Node left, right;
	Node(int val){
		this.val = val;
		left = null;
		right = null;
	}
}

class BinaryTree{
	Node root;

	BinaryTree() {}

	BinaryTree(Node node){
		root = node;
	}

	
	
	public boolean isSymmetric(Node root) {
		
		if(root == null) return true;
		
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(root.left);
		queue.add(root.right);
		
		while (!queue.isEmpty()) {
			Node tempLeft = queue.remove();
			Node tempRight = queue.remove();
			
			/* if both are null, continue and check for further elements */
			if (tempLeft == null && tempRight == null)
				continue;
			
			/* if only one is null---inequality, return false */
			if (tempLeft == null || tempRight == null)
				return false;
			
			/* if both left and right nodes exist, but
            have different values-- inequality,
            return false*/
			if (tempLeft.val != tempRight.val)
				return false;
			
			 /* Note the order of insertion of elements
            to the queue :
            1) left child of left subtree
            2) right child of right subtree
            3) right child of left subtree
            4) left child of right subtree */
			queue.add(tempLeft.left);
			queue.add(tempRight.right);
			queue.add(tempLeft.right);
			queue.add(tempRight.left);
		}
		
		return true;
	}
	
	
	
	
}




