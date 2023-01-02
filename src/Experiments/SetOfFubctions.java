package Experiments;

import java.math.BigInteger;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.toMap;


public class SetOfFubctions {
	
	private static final Predicate<Integer> IS_EVEN = (i)
			-> i % 2 == 0;
	private static final Predicate<Integer> IS_PRIME = (i)
			-> BigInteger.valueOf(i).isProbablePrime(i);
	
	
	
	
	public static void main(String[] args) {
		System.out.println(IS_EVEN.test(2));
		System.out.println(IS_PRIME.test(4));
		
		Map<Character, Integer> result = new LinkedHashMap<>();
		
		String s = "Super Pupper";
		
		for(Character c : s.toCharArray()){
			result.put(c, result.getOrDefault(c, 0)+1);
		}
		
		
	}
	
	
	
	
}

