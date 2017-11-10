public class LinkedListDeque<Item> {
	
	public class Node {
		
		public Node prev;
		public Item item;
		public Node next;

		public Node(Node p, Item i, Node n) {
			item = i;
			prev = p;
			next = n;
		}
	}

	private Node sentinel;
	private int size;

	public LinkedListDeque() {
		size = 0;
		sentinel = new Node(sentinel, null, sentinel);
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}


	public void addFirst(Item x) {
		Node newFirstNode;
		if (isEmpty()) {
			newFirstNode = new Node(sentinel, x, sentinel);
			sentinel.prev = newFirstNode;
		} 
		else {
			Node originalNode = sentinel.next;
			newFirstNode = new Node(sentinel, x, sentinel);
		}
		size += 1;
	}

	public void addLast(Item i) {
		
	}

	
	public int size() {
		return size;
	}




	/* public static void main(String<Item>() args) {
		LinkedListDeque<String> L = new LinkedListDeque<String>();
		L.addFirst("Tapatio");
		L.addFirst("Tucker");
	} */
}
