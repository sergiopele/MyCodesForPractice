import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>(5);
		map.put("Red", 5);
		map.put("White", 3);
		map.put("Orange", 2);
		map.put("Brown", 7);
		map.put("Green", 6);
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		//.forEach(System.out::println);
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
		//.forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
				.forEach(System.out::println);
	}
}

