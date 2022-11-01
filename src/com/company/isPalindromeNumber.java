package com.company;
/*
A non-negative integer is called a palindrome if it reads forward and backward in the same way.
For example, the numbers 5, 121, 3443, and 123454321 are palindromes.
Write a method that takes as input a non-negative integer and returns true if the number is a palindrome;
otherwise, it returns false. Also write a program to test your method.
 */


public class isPalindromeNumber {
	public static void main(String[] args) {
		int a = (int) (Math.random() * 10000000 + 1);
		System.out.println("is number " + a + " a palindrome? " + isPalindrome(a));
	}
	
	static boolean isPalindrome(int a) {
		String s = String.valueOf(Integer.valueOf(a));
		
		StringBuilder sb = new StringBuilder(s);
		
		s = sb.reverse().toString();
		
		int b = Integer.parseInt(s);
		
		return a == b;
	}
}
/*
 int temp = number;
        int remainder;
        int reverse = 0;
        
        while(temp > 0)
	{
            remainder = temp % 10;
            temp = temp / 10;
            reverse = reverse * 10 + remainder;
	}
        
        return reverse == number;
 */
