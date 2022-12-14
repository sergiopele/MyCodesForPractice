package universalMethodLambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Java_Functional_Example {
	public static void main(String[] args) {
		int increment = increment(5);
		System.out.println(increment);
		
		//Function example (takes one parameter) and gives one result
		increment = incrementByOneFunction.apply(increment);
		System.out.println(increment);
		
		int multiply = multiplyByTen.apply(increment);
		System.out.println(multiply);
		
		increment = addByOneAndThenMultiplyByTen.apply(increment);
		System.out.println(increment);
		
		//imperative function(2 arguments) 1 result
		System.out.println(incrementBy1AndThenMultiply(4,100));
		
		//BiFunction -> (takes two argument) and givse  1 result
		System.out.println(incrementBy1AndThenMultiplyBiFunction.apply(4,100));
		
		
	}
	
	//functional style  first argument ->accept data, second ->return type (declerative approach
	static Function<Integer, Integer> incrementByOneFunction = number -> number++;
	static Function<Integer, Integer> multiplyByTen = number -> number * 10;
	static Function<Integer, Integer> addByOneAndThenMultiplyByTen =
			incrementByOneFunction.andThen(multiplyByTen);
	static BiFunction<Integer, Integer, Integer> incrementBy1AndThenMultiplyBiFunction =
			(numberToIncrementBy1, numberToMultiplyBy)
					-> (numberToIncrementBy1 + 1) * numberToMultiplyBy;
	
	
	//all the same examples but imperative approach
	static int increment(int num) {
		return num + 1;
	}
	
	static int incrementBy1AndThenMultiply(int num, int multiplyTo) {
		return (num + 1) * multiplyTo;
	}
}
