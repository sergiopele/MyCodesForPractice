package com.company;

import java.util.Scanner;

public class biggestOfThreeNum {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		String max = "the biggest number is " + (c > (a > b ? a : b) ? c : ((a > b) ? a : b));
		String min = "the samllest number is " + (c < (a < b ? a : b) ? c : ((a < b) ? a : b));
		
		System.out.print(max + "\n" + min);
		
		/*
		String max = "the biggest number is " + (Math.max(c, (Math.max(a, b))));
		String min = "the samllest number is " + (Math.min(c, (Math.min(a, b))));
		 */
		
		
	}
}
