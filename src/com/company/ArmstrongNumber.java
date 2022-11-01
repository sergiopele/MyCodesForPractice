package com.company;

/*
Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself,
then the number is called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
 */

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int result = 0, reminder, originalNumber;
		originalNumber = num;
		
		while (originalNumber != 0) {
			reminder = originalNumber % 10;
			result += Math.pow(reminder, 3);
			originalNumber /= 10;
		}
		boolean isArmstrongNum = result == num;
		System.out.println(num + " is Armstrong number? " + isArmstrongNum);
		scan.close();
	}
}
