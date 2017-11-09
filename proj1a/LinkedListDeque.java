public class LinkedListDeque<Item> {
	
	public class Node {
		
		public Item item;
		public Node prev;
		public Node next;

		public Node(Item i, Node p, Node n) {
			item = i;
			prev = p;
			next = n;
		}
	}

	private Node sentinel;
	private int size;

	public LinkedListDeque() {
		size = 0;
		sentinel = new Node(null, sentinel, sentinel);
	}

	public boolean Empty() {
		if (size == 0) {
			return true;
		}
		return false;
	}


	public void addFirst(Item x) {
		Node newFirstNode;
		if (Empty()) {
			newFirstNode = new Node(x, sentinel, sentinel);
		}
		else {
			Node originalNode = new Node(i, sentinel, sentinel);
			newFirstNode = Node(newFirstNode, i, prev);
			size += 1;
		}
	}

	public void addLast(Item i) {
		
	}

	
	public int size() {
		return this.size;
	}




	/* public static void main(String<Item>() args) {
		LinkedListDeque<String> L = new LinkedListDeque<String>();
		L.addFirst("Tapatio");
		L.addFirst("Tucker");
	} */
}