package com.company;

import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		String reverse="";
		for (int i = input.length(); i >0 ; i--) {
			reverse+=input.charAt(i-1);
		}
		System.out.println(reverse);
		
		
		String input2 = scan.next();
		StringBuilder sb = new StringBuilder(input2);
		String result2 = sb.reverse().toString();
		System.out.println(result2);
	}
}
