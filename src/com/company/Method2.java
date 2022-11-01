package com.company;
/*

Write a method named isEven that accepts an int argument.
The method should return true if the argument is even, or false otherwise.
Also write a program to test your method.
 */

public class Method2 {
	public static void main(String[] args) {
		int b = (int) (Math.random() * 50 + 1);
		System.out.println("Is number " + b + " is even? " + isEven(b));
	}
	
	static boolean isEven(int a) {
		return (a % 2 == 0);
	}
}
