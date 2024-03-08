
public class LinkedList implements List {

	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList() {
		this.size = 0;
	}

	public int get(int index) {
		return getNode(index).getValue();
	}
	
	private Node getNode(int index) {
		if (index < 0 || index >= this.size) {
			throw new RuntimeException("Invalid index: " + index);
		}
		
		int count = 0;
		Node currentNode = this.head;
		
		while(count < index) {
			currentNode = currentNode.getNext();
			count++;
		}
		return currentNode;
	}

	public void add(int element) {
		Node newNode = new Node(element);
		
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
		
		this.size++;
	}

	public void add(int element, int index) {
		if (index < 0 || index >= this.size) {
			throw new RuntimeException("Invalid index: " + index);
		}
		
		if (index == 0) {
			Node newNode = new Node(element);
			newNode.setNext(this.head);
			this.head = newNode;
		} else {
			Node previousNode = getNode(index - 1);
			Node newNode = new Node(element);
			newNode.setNext(previousNode.getNext());
			previousNode.setNext(newNode);	
		}
		
		this.size++;
	}

	public void remove(int index) {
		Node previous = getNode(index-1);
		Node next = getNode(index+1);
		previous.next = next;
		this.size--;
		
	}

	public void replace(int element, int index) {
		Node node  = getNode(index);
		node.setValue(element);
	}

	public int getSize() {
		return this.size;
	}
	
	private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}



	
}
