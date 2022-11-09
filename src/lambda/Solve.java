package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Solve {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("John", "Smith", 24),
				new Person("Adrianna", "Jackson", 32),
				new Person("Luis", "Larsonaso", 31),
				new Person("Stive", "Capo", 26),
				new Person("Tifany", "Lee", 24)
		);
		
		people.sort((s1, s2) -> s2.getLastName().compareTo(s1.getLastName()));    //in reverse order, in normal order s1.compareTo s2
		
		
		PerformCondition(people, p -> p.getLastName().startsWith("C"), System.out::println);
		
	}
	
	public static void PerformCondition(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}
