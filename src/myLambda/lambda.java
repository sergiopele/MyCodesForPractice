package myLambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class lambda {
	public static void main(String[] args) {
		List<String> mylist = new ArrayList<>(5);
		mylist.add("Red");
		mylist.add("Violet");
		mylist.add("black");
		mylist.add("Orange");
		mylist.add("White");
		List<String> list;
		String[] s = new String[5];
		
		
		list = mylist.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(list);
		System.out.println(mylist);
		int a = 0;
		
		LinkedList<Integer> numbers = new LinkedList<Integer>(new LinkedList<>(Arrays.asList(111, 222, 333, 444, 555, 666)));
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
	}
}

