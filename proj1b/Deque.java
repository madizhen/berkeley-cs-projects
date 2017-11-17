public interface Deque<Item> {
	
	//Determines if the Linked List is empty by checking size
	public boolean isEmpty();

	//Adds an item to the front of the Deque
	public void addFirst(Item x);

	//Aads an item to the back of the Deque
	public void addLast(Item x);

	//Gets an item at thr given index, where 0 is the front, 1 is the next item, and so forth. If no such item exists, returns null. Must not alter the deque!
	public Item get(int index);

	//Returns the number of items in the Deque
	public int size();

	//Recursively gets the item
	public Item getRecursive(int index);

	//Removes & returns the item at the front of the Deque
	public Item removeFirst();

	//Removes & returns the item to the back of the Deque
	public Item removeLast();
	
	//Prints the items in the Deque from first to last, separated by a space
	public void printDeque();
}