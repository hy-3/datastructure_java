import java.util.*;

public class DequeueWithJavaInterface {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();

		deque.add("a");
		deque.addFirst("f");
		deque.addLast("o");
		deque.push("p");
		deque.offer("h");

		System.out.println(deque);
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
	}
}