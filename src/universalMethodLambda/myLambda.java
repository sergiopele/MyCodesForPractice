package universalMethodLambda;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class myLambda extends IntegerSuperMethod {
	public static void main(String[] args) throws Zero_Number_Exception {
		List<Integer> myList = Arrays.asList(11, 2, 3, 5, 6, 7, 8, 10, 9, 14, 12, 13);
		myList.forEach(s -> System.out.print(s + "=" + isPrime(s) + " "));
		System.out.println();
		myList.stream().filter(IntegerSuperMethod::isEven).forEach(s -> System.out.print(s + " "));
		System.out.println();
		myList.stream().filter(IntegerSuperMethod::isPalindrome).forEach(s -> System.out.println(s + " "));
		System.out.println();
		myList.stream().filter(IntegerSuperMethod::isComposite).forEach(s -> System.out.print(s + " "));
		int a = 3;
		System.out.println(BigInteger.valueOf(a).isProbablePrime(100));
		
		
	}
}
	
	
	class IntegerSuperMethod {
		
		public static boolean isEven(int a) {
			try {
				ZeroException(a);
			} catch (Zero_Number_Exception e) {
				e.printStackTrace();
			}
			return a % 2 == 0;
		}
		
		public static boolean isPrime(int a) {
			if (a <= 1) return false;
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					return false;
				}
			}
			return true;
		}
		
		public static boolean isPalindrome(int a) {
			if (a < 10) return false;
			int holder = a;
			int reverse = 0;
			while (a != 0) {
				int reminder = a % 10;
				reverse = reverse * 10 + reminder;
				a /= 10;
			}
			return reverse == holder;
		}
		
		public static boolean isComposite(int a) {
			if (a <= 1) return false;
			if (a % 2 == 0 || a % 3 == 0) return true;
			for (int i = 5; i < a; i++) {
				if (a % i == 0) return true;
			}
			return false;
			
		}
		
		public static void ZeroException(int a) throws Zero_Number_Exception {
			if (a <= 0) {
				throw new Zero_Number_Exception("Value is not acceptable - number is zero");
			}
		}
	}
	
	class Zero_Number_Exception extends Exception {
		Zero_Number_Exception(String s) {
			super(s);
		}
	}


	


