package Practice.String;

import java.util.Scanner;

/*
You need to write a simple Java program to check if a given String is palindrome or not.
A Palindrome is a String which is equal to the reverse of itself, e.g.,
"Bob" is a palindrome because of the reverse of "Bob" is also "Bob."
Though be prepared with both recursive and iterative solution of this problem.
The interviewer may ask you to solve without using any library method, e.g. indexOf() or subString()
so be prepared for that.

 */
public class StringPalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String stor = "";
		
		for (int i =word.length()-1; i>=0; i--) {
			stor+=word.charAt(i);
		}
		boolean isPalindrome =(stor.equalsIgnoreCase(word));
		System.out.println("is "+word+" palindrome: "+isPalindrome);
		
		StringBuilder a = new StringBuilder(word);
		System.out.println((word.equalsIgnoreCase(a.reverse().toString())));
		scan.close();
	}
}
