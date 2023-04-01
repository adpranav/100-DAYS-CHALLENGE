//SUM OF NODES
//For a given Binary Tree of integers, find and return the sum of all the nodes data.

/*

	Following is the Binary Tree Node class structure.

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

 */

public class Solution {

	public static int getSum(BinaryTreeNode<Integer> root) {
		//Your code goes here.
		if(root==null){
			return 0;
		}
		return root.data + getSum(root.left)+getSum(root.right);
	}

}
