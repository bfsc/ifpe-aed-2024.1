
public class Main {

	public static void main(String[] args) {
		BinaryTree bst = new BinarySearchTree();
		bst.add(8);
		bst.add(3);
		bst.add(20);
		bst.add(2);
		bst.add(7);
		bst.add(5);
		
		bst.remove(3);
		
		bst.preOrderTraversal();
	}
	
}
