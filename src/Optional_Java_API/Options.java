package Optional_Java_API;

import java.util.Optional;

public class Options {
	public static void main(String[] args) {
		Optional.ofNullable(null)
				.ifPresentOrElse(email -> System.out.println("sending email to " + email),
						() -> System.out.println("cannot send email"));
		
	}
}
