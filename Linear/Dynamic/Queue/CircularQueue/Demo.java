public class Demo {
	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(5);
		
		q.enQueue(23);
		q.enQueue(2);
		q.enQueue(343);
		q.enQueue(-1);
		q.displayQueue();

		System.out.println("Deleted: " + q.deQueue());
		q.displayQueue();

		q.enQueue(99);
		q.enQueue(7);
		q.displayQueue();
	}
}