public class Stack {
	static final int MAX = 100;
	int top;
	int a[] = new int[MAX];

	boolean isEmpty() {
		return (top < 0);
	}

	Stack() {
		top = -1;
	}

	boolean push(int x) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack overflow.");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + " pushed in to stack.");
			return true;
		}
	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else {
			return a[top--];
		}
	}

	int peek() {
		if (top < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else {
			return a[top];
		}
	}

	void print() {
		for (int i = top; i > -1; i--) {
			System.out.print(a[i] + "\n");
		}
	}
}