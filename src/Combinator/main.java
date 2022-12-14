package Combinator;

import java.time.LocalDate;

import static Combinator.CustomerRegistrationValidator.isAnAdult;
import static Combinator.CustomerRegistrationValidator.isEmailValid;

public class main {
	public static void main(String[] args) {
		Customer customer = new Customer("Alice",
				"alice@sdrfwer.com",
				"+0324344232",
				LocalDate.of(2000, 1, 1)
		);
		
		//System.out.println((new CustomerValidatorService().isValid(customer)));
		//if valid we can store customer in db;
		
		//using combinator pattern
		CustomerRegistrationValidator.ValidationResult result =
				isEmailValid()
				.and(isAnAdult())
				.apply(customer);
		
		System.out.println(result);
		if (result!= CustomerRegistrationValidator.ValidationResult.SUCCESS){
			throw new IllegalStateException(result.name());
		}
	}
}
