import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("agent \\d{3,4}");
		Matcher matcher=pattern.matcher("agent 007");
		Boolean result = matcher.find();
		System.out.println(result);
	}
}
