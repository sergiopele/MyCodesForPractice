package com.company;

import java.util.Scanner;

public class reverseNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		/*
		String cast = String.valueOf(Integer.valueOf(input));
		StringBuilder sb = new StringBuilder(cast);
		input = Integer.parseInt(String.valueOf(cast=sb.reverse().toString())) ;
		System.out.println(input);
		 */
		int reverse=0;
		while(input!=0){						//for example we have num 430
			int digit = input%10;				//430%10 - remainder 0    -digit=0
			reverse=reverse*10+digit;			//0*10+0(digit) = 0
			input=input/10;						//(input) 430/10=43
		}
		System.out.println(reverse);
	}
}
