package universalMethodLambda;

import java.util.function.Predicate;

public class Predicate_Example {
	public static void main(String[] args) {
		
		//Without predicate
		System.out.println(isPhoneNumberValid("0700000000"));
		System.out.println(isPhoneNumberValid("07000000000"));
		
		//With predicate
		System.out.println(isPhoneNumberValidPredicate.test("070000000"));
		System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
		
		//Combination of two predicates
		System.out.println("is phone number valid and contains 3 " +
				isPhoneNumberValidPredicate.and(containsNumber3).test("07000000003"));
	}
	
	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
	}
	
	static Predicate<String> containsNumber3 = phoneNumber
			-> phoneNumber.contains("3");
	
	static Predicate<String> isPhoneNumberValidPredicate = phoneNumber
			-> phoneNumber.startsWith("07") && phoneNumber.length() == 11;
}
