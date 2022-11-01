package com.company;

/*
Write a program with a method named getTotal that accepts two integers
as an argument and return its sum. Call this method from main( ) and print the results.
 */
public class Methods1 extends Number {
	public static void main(String[] args) {
		Number n = new Number();
		System.out.println(n.getTotal(3,6));
	}
}

class Number{
	int getTotal(int a,int b){
		return a+b;
	}
}
