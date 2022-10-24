class DoublyLinkedList {
	Node head;

	public static class Node {
		private Node next = null;
		private Node prev = null;
		private int data;

		public Node(int data) {
			this.data = data;
		}
	}

	public void push(int new_data) {
		Node newNode = new Node(new_data);

		newNode.next = head;
		if (head != null) {
			head.prev = newNode;
		}

		head = newNode;
	}

	public void InsertAfter(Node prevNode, int new_data) {
		if (prevNode == null) {
			System.out.println("Given node can't be null.");
			return;
		}

		Node newNode = new Node(new_data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		newNode.prev = prevNode;
		if (newNode.next != null) {
			newNode.next.prev = newNode;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.push(1);
		dll.InsertAfter(dll.head, 2);
		dll.InsertAfter(dll.head.next, 3);

		Node n = dll.head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
}