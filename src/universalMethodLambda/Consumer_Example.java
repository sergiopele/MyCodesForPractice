package universalMethodLambda;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumer_Example {
	public static void main(String[] args) {
		Customer maria = new Customer("Maria", "12343123414");
		
		//normal java function
		greetCustomer(maria);
		greetCustomerConsumeV2(maria,true);
		
		//Consumer functional interface
		//Consumer ->return type void
		greetCustomerConsumer.accept(maria);
		greetCustomerConsumerV2.accept(maria, false);
		
		
	}
	
	
	static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
			System.out.println("Hello " + customer.customerName + "thanks for registration "
					+ (showPhoneNumber ? customer.customerPhoneNumber : "***********"));
	
	static Consumer<Customer> greetCustomerConsumer = customer ->
			System.out.println("Hello " + customer.customerName + "thanks for registration "
					+ customer.customerPhoneNumber);
	static void  greetCustomerConsumeV2(Customer customer, boolean showPhoneNumber) {
		System.out.println("Hello " + customer.customerName + "thanks for registr ation "
				+ (showPhoneNumber ? customer.customerPhoneNumber : "**********"));
	}
	
	static void greetCustomer(Customer customer) {
		System.out.println("Hello " + customer.customerName + "thanks for registration "
				+ customer.customerPhoneNumber);
	}
	
	static class Customer {
		private final String customerName;
		private final String customerPhoneNumber;
		
		
		Customer(String customerName, String customerPhoneNumber) {
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}
	}
}
