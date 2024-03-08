
public class LinkedStack implements Stack {

	private int size;
	private Node top;
	
	public void push(int element) {
		Node newNode = new Node(element);
		newNode.setNext(this.top);
		this.top = newNode;
		this.size++;
	}

	public int peek() {
		if (this.top == null) {
			throw new RuntimeException("Empty stack");
		}
		
		return this.top.getValue();
	}

	public int pop() {
		if (this.top == null) {
			throw new RuntimeException("Empty stack");
		}
		
		int topValue = this.top.getValue();
		this.top = this.top.getNext();
		this.size--;
		
		return topValue;
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
