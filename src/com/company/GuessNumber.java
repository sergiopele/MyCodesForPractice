package com.company;
/*
Write a program that generates a random number and asks the user to guess what the number is.
If the user's guess is higher than the random number, the program should display "Too high,
try again." If the user's guess is lower than the random number,
the program should display "Too low, try again."
The program should use a loop that repeats until the user correctly guesses the random number.
 */

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int secretNumber = (int) (Math.random() * 50 + 1);
		
		System.out.println("Guess the number from 1 - 50");
		int count = 0;
		
		while (true) {
			
			int user = scan.nextInt();
			
			if (user > secretNumber) {
				System.out.println("Too high, try again");
				count++;
			} else if (user == secretNumber) {
				break;
			} else {
				System.out.println("Too low, try again");
				count++;
			}
			
		}
		System.out.println("Congrats, you exposed the mystery... from " + count + "th attempt!");
		scan.close();
		
	}
	
}
