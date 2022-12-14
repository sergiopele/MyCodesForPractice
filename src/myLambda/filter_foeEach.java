package myLambda;


import java.util.Arrays;
import java.util.List;

public class filter_foeEach {
	public static void main(String[] args) {
		List<String>list= Arrays.asList("Josh","Semen","Peter","Samuel");
		list.stream().filter(filter_foeEach::isNotSemen)
				.forEach(System.out::println);
	}
	private static boolean isNotSemen(String name){
		return !name.equals("Semen");
	}
}
