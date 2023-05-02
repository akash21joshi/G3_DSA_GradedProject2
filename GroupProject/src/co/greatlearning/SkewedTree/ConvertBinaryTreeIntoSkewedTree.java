package co.greatlearning.SkewedTree;

public class ConvertBinaryTreeIntoSkewedTree {

	public static void main(String[] args) {
		 Main tree = new Main();
	     tree.node = new Node(5);
	     tree.node.left = new Node(3);
	     tree.node.right = new Node(8);
	     tree.node.left.left = new Node(1);
	     tree.node.left.right = new Node(4);
	     tree.node.right.left = new Node(7);
	     tree.node.right.right = new Node(9);
	     tree.printPreOrder(tree.node);
	     tree.node = tree.convertBinarySearchTree(tree.node, null);
	     System.out.println();
	     tree.printPreOrder(tree.node);
	     
	}

}