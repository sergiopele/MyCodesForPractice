package lambda;

import java.util.Arrays;
import java.util.List;

public class Solve {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("John", "Smith", 24),
				new Person("Adrianna", "Jackson", 32),
				new Person("Luis", "Larsonaso", 31),
				new Person("Stive", "Capo", 26),
				new Person("Tifany", "Lee", 24)
		);
		people.sort((Person s1, Person s2) -> s2.getLastName().compareTo(s1.getLastName()));
		
		people.forEach(s->{
			if(s.getLastName().startsWith("C")){
				System.out.println(s);
			}
			
		});
		
	}
}
