package com.company;
/*

A prime number is a number that is evenly divisible only by itself and 1.
For example, the number 5 is prime because it can be evenly divided only by 1 and 5.
The number 6, however, is not prime because it can be divided evenly by 1, 2, 4, and 6.
Write a method named isPrime, which takes an integer as an argument and returns true if the argument is a prime number, or false otherwise.
Also write main method that displays prime numbers between 1 to 500.

 */

import java.math.BigInteger;

public class Methods3 {
	public static void main(String[] args) {
		int b = (int) (Math.random() * 500 + 1);
		System.out.println("is number " + 1 + " is prime? " + isPrime(7));
		System.out.println("is number " + 1 + " is prime? " + isPrimeMethod(7));
	}
	
	static boolean isPrime(int a) {
		//if(a == 1) return false;
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	
	static boolean isPrimeMethod(int a) {
		return BigInteger.valueOf(a).isProbablePrime(a);
	}
	
}

