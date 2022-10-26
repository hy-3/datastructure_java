class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}

class SimpleBinaryTree {
	Node root;

	SimpleBinaryTree() {
		root = null;
	}

	SimpleBinaryTree(int data) {
		root = new Node(data);
	}

	void preOrderTraverse(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.data + " ");
		preOrderTraverse(node.left);
		preOrderTraverse(node.right);
	}
	void preOrderTraverse() {
		preOrderTraverse(root);
	}

	void postOrderTraverse(Node node) {
		if (node == null) {
			return ;
		}

		postOrderTraverse(node.left);
		postOrderTraverse(node.right);
		System.out.println(node.data + " ");
	}
	void postOrderTraverse() {
		postOrderTraverse(root);
	}

	void inOrderTraverse(Node node) {
		if (node == null) {
			return ;
		}

		inOrderTraverse(node.left);
		System.out.println(node.data + " ");
		inOrderTraverse(node.right);
	}
	void inOrderTraverse() {
		inOrderTraverse(root);
	}

}

class Demo {
	public static void main(String[] args) {
		SimpleBinaryTree bt = new SimpleBinaryTree(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.root.right.left = new Node(6);
		bt.root.right.right = new Node(7);
		bt.root.left.left.left = new Node(8);
		/*
					1
				   /  \
				  2	    3
				/  \   /  \
			   4    5 6    7
			  /
			 8
		*/

		System.out.println("-- pre order --");
		bt.preOrderTraverse();
		System.out.println("\n-- post order --");
		bt.postOrderTraverse();
		System.out.println("\n-- in order --");
		bt.inOrderTraverse();

	}
}