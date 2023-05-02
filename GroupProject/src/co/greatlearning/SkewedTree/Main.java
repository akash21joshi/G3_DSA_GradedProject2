package co.greatlearning.SkewedTree;

class Node{
	int val; 
	Node right;
	Node left;
	Node(int val){
		this.val = val;
	}
}
public class Main {
	Node node;
	public Node convertBinarySearchTree(Node root, Node prev) {
		if (root==null) {
			return prev;
		}
		Node temp;
		if (prev==null) {
			root.right = convertBinarySearchTree(root.right, null);
		}
		else {
			if (root.right!=null) {
				root.right = convertBinarySearchTree(root.right, prev);
			}
			else {
				root.right = prev;
			}
		}
		temp = root.left;
		root.left = null;
		return convertBinarySearchTree(temp, root);
	}
	
	public void printPreOrder(Node root) {
		if (root!=null) {
			System.out.print(root.val+" ");
			printPreOrder(root.left);
			printPreOrder(root.right);
		}
		
	}
}