package com.company;

import java.util.Scanner;

public class compareTwoStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		String result;
		
		System.out.println(result=(a.equals(b))?"Words are equal":"Words are NOT");
	}
}
