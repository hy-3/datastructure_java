class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}

class BinarySearchTree {
	Node root;
	BinarySearchTree() {
		root = null;
	}
	BinarySearchTree(int data) {
		root = new Node(data);
	}

	void insert(int data) {
		root = insertData(root, data); 
	}
 
	Node insertData(Node node, int data)
	{
		if (node == null) {
			node = new Node(data);
			return node;
		} else if (data < node.data) {
			node.left = insertData(node.left, data);
		} else if (data > node.data) {
			node.right = insertData(node.right, data);
		}
		return node;
	}

	void inOrderTraverse() {
		inOrderTraverse(root);
	}
	void inOrderTraverse(Node node) {
		if (node != null) {
			inOrderTraverse(node.left);
			System.out.println(node.data);
			inOrderTraverse(node.right);
		}
	}
}

class Demo {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(70);
		bst.insert(60);
		bst.insert(80);

		bst.inOrderTraverse();
	}
}