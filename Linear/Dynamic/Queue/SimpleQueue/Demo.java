public class Demo {
	public static void main(String[] args) {
		Queue queue = Queue.createQueue(10);
		Queue.queueEnqueue(queue, 3);
		Queue.queueEnqueue(queue, 25);
		Queue.queueEnqueue(queue, 90);
		Queue.queueEnqueue(queue, 5);
		Queue.queueDequeue(queue);
		while (!(Queue.isEmpty(queue))) {
			System.out.println(Queue.front(queue));
			Queue.queueDequeue(queue);
		}
	}
}