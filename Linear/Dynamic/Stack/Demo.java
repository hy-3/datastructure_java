public class Demo {
	public static void main(String[] args) {
		Stack stack = new Stack();

		stack.push(1);
		stack.push(2);
		stack.push(4);
		stack.push(23);
		stack.push(100);

		System.out.println("pop: " + stack.pop());
		System.out.println("pop: " + stack.pop());
		System.out.println("peek: " + stack.peek());

		stack.print();
	}
}