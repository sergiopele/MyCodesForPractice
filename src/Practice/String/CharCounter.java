package Practice.String;
/*
Java Program to count the total number of characters in a string
 */

public class CharCounter {
	public static void main(String[] args) {
		
		String word = "My char ";
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			count = (word.charAt(i) != ' ') ? count + 1 : count;
		}
		System.out.println(count);
	}
}
