package questionPartPractice;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.lang.System.*;

public class AutoPart {
	public static void main(String[] args) {
		Scanner scan = new Scanner(in);
		int num = scan.nextInt();
		autoParts(num);
		
	}
	
	
	public static void autoParts(int a) {
		String result = (a % 4 == 0 && a % 7 == 0) ? "Customer Service"
				: (a % 4 == 0) ? "Auto" : (a % 7 == 0) ? "Parts" : Integer.toString(a);
		out.println(result);
	}
	
	
}
