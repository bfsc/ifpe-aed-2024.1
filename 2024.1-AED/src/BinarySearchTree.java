
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
		} else if (value > node.value) {
			node.right = add(value, node.right);
		}
		
		return node;
	}
	
	public boolean contains(int value) {
		return contains(value, this.root);
	}
	
	private boolean contains(int value, Node node) {
		if (node != null) {
			if (value == node.value) {
				return true;
			} else if (value < node.value) {
				return contains(value, node.left);
			} else {
				return contains(value, node.right);
			}
		}
		
		return false;
	}

	public void remove(int value) {
		this.root = remove(value, this.root);
	}
	
	private Node remove(int value, Node node) {
		if (node != null) {
			if (value == node.value) {
				if (node.left == null && node.right == null) {
					return null;
				} else if (node.left != null && node.right != null) {
					Node inOrderPredecessor = node.left;
					while (inOrderPredecessor.right != null) {
						inOrderPredecessor = inOrderPredecessor.right;
					}
					node.value = inOrderPredecessor.value;
					node.left = remove(inOrderPredecessor.value, node.left);
					return node;
				} else {
					return node.left == null ? node.right : node.left;
				}
			} else if (value < node.value) {
				node.left = remove(value, node.left);
			} else {
				node.right = remove(value, node.right);
			}
		}
		
		return node;
	}

	public void preOrderTraversal() {
		preOrderTraversal(this.root);
	}

	private void preOrderTraversal(Node node) {
		if (node != null) {
			System.out.println(node.value);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	public void inOrderTraversal() {
		inOrderTraversal(this.root);
	}

	private void inOrderTraversal(Node node) {
		if (node != null) {
			inOrderTraversal(node.left);
			System.out.println(node.value);
			inOrderTraversal(node.right);
		}
	}
	
	public void postOrderTraversal() {
		postOrderTraversal(this.root);
	}
	
	private void postOrderTraversal(Node node) {
		if (node != null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.println(node.value);
		}
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
