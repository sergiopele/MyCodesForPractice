package universalMethodLambda;

import java.util.List;
import java.util.function.Supplier;

public class Supplier_Example {
	public static void main(String[] args) {
		System.out.println(getDBConnectionUrl());
		
		//Functional version
		System.out.println(getDBConnectionUrlSupplier.get());
	}
	
	static String getDBConnectionUrl() {
		return "jdbc:localhost:3456/users";
	}
	
	static Supplier<List<String>> getDBConnectionUrlSupplier = ()
			-> List.of("jdbc:localhost:3456/users",
			"jdbc:localhost:3456/customer");
}
