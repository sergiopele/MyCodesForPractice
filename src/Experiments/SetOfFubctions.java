package Experiments;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;


public class SetOfFubctions {
	
	/*Here am trying to create map that will contain functions (methods) to perform certain operation
	with Integers
	 */
	public static final Map<String, Predicate<Integer>> PREDICATE_FUNCTIONAL_MAP = new HashMap<>();
	private static final Predicate<Integer> IS_EVEN = (i)
			-> i % 2 == 0;
	private static final Predicate<Integer> IS_PRIME = (i)
			-> BigInteger.valueOf(i).isProbablePrime(i);
	
	public static PredicateFunctions  findPredicateFunction =
			(key, number) -> {
				PREDICATE_FUNCTIONAL_MAP.put("isEven", IS_EVEN);
				PREDICATE_FUNCTIONAL_MAP.put("isPrime", IS_PRIME);
				return PREDICATE_FUNCTIONAL_MAP.get(key).test(number);
			};
	
	public static void main(String[] args) {
		
		System.out.println(findPredicateFunction.findPredicateFunction("isEven",10));
	}
	
	
	
	
}
@FunctionalInterface
interface PredicateFunctions{
	boolean findPredicateFunction(String key, int num);
}

