public class Palindrome implements CharacterComparator {

	/* Build a Deque where the characters in the deque appear in the same order as
	 * in the word.
	 * Search the web to see how to get the ith character in a String 
	 * --> text.charAt(#)
	 * Inserting chars into a Deque<Character> is just like inserting ints into a    * LinkedListDeque<Integer>
	 */

	public static Deque<Character> wordToDeque(String word) {
		Deque<Character> wordInDeque = new ArrayDequeSolution<>();
		for (int i = 0; i < word.length(); i++) {
			wordInDeque.addLast(word.charAt(i));
		} 
		return wordInDeque;
	}

	/* The isPalindrome method should return true if the given word is a palindrome, 
	 * and false otherwise. A palindrome is defined as a word that is the same whether
	 * it is read forwards or backwards. For example "a", "racecar", and "noon" are all
	 * palindromes. "horse", "rancor", and "aaaaab" are not palindromes. Any word of 
	 * length 1 or 0 is a palindrome.
	 * 'A' != 'a'
	 * Recursion, probably
	 */

	public static boolean isPalindrome(String word) {
		if (word.length() == 0 || word.length() == 1) {
			return true;
		} else {
			return reverseString(word).equals(word);
		}
	}

	private static String reverseString(String str){
        if(str.length() == 1){
            return str;
        }else{
            String reversed = reverseString(str.substring(1)) + str.charAt(0);
            return reversed;
        }
    }

	/*private reverseString() {
		if (str.legnth == 1) {
			return str;
		} else {
			String reverse = new StringBuffer(string).reverse().toString();
			return reverse;
		}
		breaks
			*/

	@Override
	public boolean equalChars(char x, char y) {
		return x == y;
	}

	/* Will return true if the word is a palindrome according to the character comparison 
	 * test provided by the CharacterComparator passed in as argument cc
	 */

	public static boolean isPalindrome(String word, CharacterComparator cc){
        boolean isEqual = false;
        for(int i = 0, j = word.length() - 1; i < word.length()/2; i++,j--){
           if(cc.equalChars(word.charAt(i),word.charAt(j)) == false) {
              isEqual = false;
           }else{
              isEqual = true;
           }

        }
        return isEqual;
    }

	public static void main(String[] args) {
		CharacterComparator cc = new Palindrome();
		wordToDeque("morning");
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome("aaa"));
		System.out.println(isPalindrome("noon"));
		System.out.println(isPalindrome("a"));
		System.out.println(isPalindrome("great", cc));
	}
}