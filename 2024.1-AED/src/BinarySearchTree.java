
public class BinarySearchTree implements BinaryTree  {

	private Node root;
	private int size;
	
	public void add(int value) {
		this.root = add(value, this.root);
	}

	private Node add(int value, Node node) {
		if (node == null) {
			this.size++;
			return new Node(value);
		} else if (value < node.value) {
			node.left = add(value, node.left);
			return node;
		} else if (value > node.value) {
			node.right = add(value, node.right);
			return node;
		}
		
		return null;
	}
	
	public boolean contains(int value) {
		return false;
	}

	public void remove(int value) {
		
	}

	public void preOrderTraversal() {
		
	}

	public void inOrderTraversal() {
		
	}

	public void postOrderTraversal() {
		
	}
	
	private class Node {
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
}
