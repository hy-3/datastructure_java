public class Queue {
	int front;
	int rear;
	int cap;
	int arr[];

	static Queue createQueue(int cap) {
		Queue queue = new Queue();
		queue.cap = cap;
		queue.front = 0;
		queue.rear = 0;
		queue.arr = new int[cap];
		return queue;
	}

	static boolean isEmpty(Queue queue) {
		if (queue.front == queue.rear) {
			return true;
		}
		return false;
	}

	static boolean isFull(Queue queue) {
		if (queue.cap - 1 == queue.rear) {
			System.out.println("Queue is full.");
			return true;
		}
		return false;
	}

	static int front(Queue queue) {
		if (isEmpty(queue)) {
			return Integer.MIN_VALUE;
		}
		return queue.arr[queue.front];
	}

	static int rear(Queue queue) {
		if (isEmpty(queue))
			return Integer.MIN_VALUE;
		return queue.arr[queue.rear];
	}

	static void queueEnqueue(Queue queue, int data){
		if (isFull(queue)) {
			return;
		}
		queue.arr[queue.rear] = data;
		queue.rear++;
	}

	static void queueDequeue(Queue queue){
		if (queue.front == queue.rear) {
			System.out.println("Queue is empty.");
			return;
		}
		for (int i = 0; i < queue.rear; i++) {
			queue.arr[i] = queue.arr[i + 1];
		}
		queue.rear--;
	}
}