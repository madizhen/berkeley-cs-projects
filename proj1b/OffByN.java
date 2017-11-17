public class OffByN implements CharacterComparator {
	
	/* The OffBYN constructor should return an object whose 
	 * equalChars method returns true for characters that are 
	 * off by N. For example the call to equal chars below should
	 * return true, since a and f are off by 5 letters, but the 
	 * second call would return false since f and h are off by 4 letters.
	*/
	
	int N;

	OffByN(int N) {
		N = N;
	}

	@Override
	public boolean equalChars(char x, char y) {
		return Math.abs(x - y) == 5;
	}

	public static void main(String[] args) {
		OffByN ob5 = new OffByN(5);
		System.out.println(ob5.equalChars('a', 'f'));
        System.out.println(ob5.equalChars('f', 'h'));
        System.out.println(ob5.equalChars('r', 's'));
        System.out.println(ob5.equalChars('r', 'w'));
	}
	
}