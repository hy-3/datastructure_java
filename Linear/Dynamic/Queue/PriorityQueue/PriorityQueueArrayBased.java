import java.util.*;

class Item {
	public int value;
	public int priority;

	Item (int value, int priority) {
		this.value = value;
		this.priority = priority;
	}
}

class PriorityQueue {
	static Item[] pr = new Item[100];
	static int size = -1;

	static void enqueue(int value, int priority) {
		size++;
		pr[size] = new Item(value, priority);
	}

	static int peek() {
		int highestPriority = Integer.MIN_VALUE;
		int index = -1;

		for (int i = 0; i <= size; i++) {
			if (highestPriority < pr[i].priority) {
				highestPriority = pr[i].priority;
				index = i;
			}
		}
		return index;
	}

	static void dequeue() {
		int index = peek();
		for (int i = index; i < size; i++) {
			pr[i] = pr[i + 1];
		}
		size--;
	}

	public static void main(String[] args) {
		enqueue(10, 2);
		enqueue(14, 4);
		enqueue(16, 4);
		enqueue(12, 3);
		
		System.out.println(pr[peek()].value);
		dequeue();
		System.out.println(pr[peek()].value);
		dequeue();
		System.out.println(pr[peek()].value);
		dequeue();
		System.out.println(pr[peek()].value);

	}
}
