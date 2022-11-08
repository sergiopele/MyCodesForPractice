package lambda;

public class Solution {
	public static void main(String[] args) {
		MyLambda obj1 = a -> System.out.println("Length of "+a+" "+a.length());
		//data type must be the same as in interface that method perform, name - whatever  (it's not printing)
		AddingFunc addTwoNum = (b, d) -> b + d;
		//create new interface adding, set two parameters on it. Signature MUST be the same as in interface
		//When we use lambda expression we kinda go directly to set way of implementation for objects
		System.out.println(addTwoNum.Adding(13,4));
		//this is IMPLEMENTATION of interface AddingFunc
		
		
		obj1.printLength("David");    // --- if there is ONE parameter we can write lambda without '()'
		//type inference
	}
}
@FunctionalInterface						//gives clue to developers to don't add any methods inside (coz lambda requires just ONE method in interface)
interface MyLambda {
	void printLength(String a);
}
@FunctionalInterface
interface AddingFunc {
	int Adding(int a, int b);
}