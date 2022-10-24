class CircularLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		CircularLinkedList ll = new CircularLinkedList();
		ll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		ll.head.next = second;
		second.next = third;
		third.next = ll.head;

		Node n = ll.head;
		for (int i = 0; i < 10; i++) {
			System.out.println(n.data);
			n = n.next;
		}
	}
}