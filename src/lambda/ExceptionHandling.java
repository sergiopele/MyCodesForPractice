package lambda;

import java.util.function.BiConsumer;

public class ExceptionHandling {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int key = 2;
		
		process(numbers, key, wrapperLambda((a, b) -> System.out.println(a + b)));
		
	}
	
	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int a : numbers
		) {
			consumer.accept(a, key);
			
		}
	}
	private  static BiConsumer<Integer, Integer>wrapperLambda(BiConsumer<Integer, Integer> consumer){
		return (a,b)-> {
			consumer.accept(a,b);
		};
	}
}
