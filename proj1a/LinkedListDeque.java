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
		Node newLastNode;
		if (isEmpty()) {
			newLastNode = new Node(sentinel, x, sentinel);
			sentinel.next = newLastNode;
		} 
		else {
			Node originalNode = sentinel.prev;
				newLastNode = new Node(originalNode, x, sentinel);
				//originalNode.next = originalNode;
			}

			size += 1;
	}
	
	public Item removeFirst() {
		if (isEmpty() == true) {
			return null;
		}

		Node firstNode = sentinel.next;
		Item returnLater = firstNode.item;

		sentinel.next = firstNode.next;
		firstNode.next.prev = sentinel;

		size -= 1;
		firstNode = null;
		return returnLater;
	}
	
	public Item removeLast() {
		if (isEmpty() == true) {
			return null;
		}

		Node lastNode = sentinel.prev;
		Item lastItem = lastNode.item;

		sentinel.prev = lastNode.prev;
		lastNode.prev.next = sentinel;

		size -= 1;
		lastNode = null;
		return lastItem;

	}
	
	public Item get(int index) {
		if (isEmpty() == true || index > size) {
			return null;
		}

		Node getThis = sentinel.next;
		int counter = 0;

		while (counter != index) {
			getThis = getThis.next;
			counter += 1;
		}
		return getThis.item;
	}
	
	public int size() {
		return size;
	}

	public void printDeque() {
		if (isEmpty() == true) { 
			System.out.println("void");
		}

		Node p = sentinel.next;
		while (p != sentinel) {
			System.out.println(p + " ");
			p = p.next;
		}
	}

	/* public static void main(String<Item>() args) {
		LinkedListDeque<String> L = new LinkedListDeque<String>();
		L.addFirst("Tapatio");
		L.addFirst("Tucker");
	} */
}
