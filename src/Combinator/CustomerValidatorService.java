package Combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
	private boolean isEmailValid(String email) {
		return email.contains("@");
	}
	
	private boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("+0");
	}
	
	private boolean isAdult(LocalDate dob) {
		return Period.between(dob, LocalDate.now()).getYears() > 16;
	}
	
	public boolean isValid(Customer custome) {
		return isEmailValid(custome.getEmail()) &&
				isPhoneNumberValid(custome.getPhoneNumber()) &&
				isAdult(custome.getDob());
	}
	
	
}
