package com.company;
/*
Write a program to calculate the sum of following series where n is input by user.
1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
 */

import java.util.Scanner;

public class CalculateSeries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int term = scan.nextInt();
		
		double sum=0;
		for(int i=1;i<=term;i++){
			sum+=1.0/i;
		}
		System.out.println(sum);
		scan.close();
	
	}
}
