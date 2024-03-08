
public class LinkedQueue implements Queue {

	private Node front;
	private Node rear;
	private int size;
	
	public void offer(int element) {
		Node newNode = new Node(element);
		
		if (this.front == null) {
			this.front = newNode;
			this.rear = newNode;
		} else {
			this.rear.setNext(newNode);
			this.rear = newNode;
		}
		
		this.size++;
	}

	public int peek() {
		validateListEmpty();
		return this.front.getValue();
	}

	public int poll() {
		validateListEmpty();
		int value = this.front.getValue();
		this.front = front.getNext();
		this.size--;
		return value;
	}
	
	private void validateListEmpty() {
		if (this.front == null) {
			throw new RuntimeException("Empty queue");
		}
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
