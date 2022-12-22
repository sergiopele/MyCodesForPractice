package Experiments;

import java.math.BigInteger;

import java.util.function.Predicate;


public class SetOfFubctions {
	
	private static final Predicate<Integer> IS_EVEN = (i)
			-> i % 2 == 0;
	private static final Predicate<Integer> IS_PRIME = (i)
			-> BigInteger.valueOf(i).isProbablePrime(i);
	
	
	
	
	public static void main(String[] args) {
		System.out.println(IS_EVEN.test(2));
		System.out.println(IS_PRIME.test(4));
		
	}
	
	
	
	
}

