package com.company;

import java.util.Scanner;

public class FibonacciNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int term = scan.nextInt();
		int n1 = 0, n2 = 1, n3 = 0;
		System.out.print(n3 + " ");
		for (int i = 0; i < term - 1; i++) {
			n3 = n2 + n1;
			n2 = n1;
			n1 = n3;
			System.out.print(n3 + " ");
		}
		scan.close();
	}
}
