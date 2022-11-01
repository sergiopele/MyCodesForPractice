package com.company;

import java.util.Scanner;

public class evenOrOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(isEvenOrOdd(scan.nextInt()));
		
	}
	
	static String isEvenOrOdd(int a) {
		return (a != 0) ? (a % 2 == 0) ? "Num is Even" : "Num is Odd" : "Num is O";
	}
}
