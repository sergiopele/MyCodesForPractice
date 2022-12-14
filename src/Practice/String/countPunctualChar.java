package Practice.String;
/*
 Java Program to count the total number of punctuation characters exists in a String
 */

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class countPunctualChar {
	public static void main(String[] args) throws IOException {
		
		String word = "How are u? What did u do 2day? ...";
		int punctualCount = 0;
		
		for (int i = 0; i < word.length(); i++) {
			punctualCount = (word.charAt(i) == ',' || word.charAt(i) == '.' || word.charAt(i) == '?'
					|| word.charAt(i) == '/' || word.charAt(i) == '!') ? punctualCount + 1 : punctualCount;
		}
		System.out.println(punctualCount);
		
		/*
		Java Program to count the total number of vowels and consonants in a string
		 */
		String word2 = "Zoo";
		word2 = word2.toLowerCase();
		
		int vowel = 0;
		int constant = 0;
		
		for (int i = 0; i < word2.length(); i++) {
			if (word2.charAt(i) == 'a' || word2.charAt(i) == 'e' || word2.charAt(i) == 'i'
					|| word2.charAt(i) == 'o' || word2.charAt(i) == 'u') {
				vowel++;
			} else if (word2.charAt(i) >= 'a' || word2.charAt(i) <= 'z') {
				constant++;
			}
		}
		System.out.println("Vowels: " + vowel + "\n" + "Constant: " + constant);
		
		/*
		Java Program to determine whether two strings are the anagram
		 */
		String one = "cheater";
		String two = "teacher";
		
		one = one.toLowerCase();
		two = two.toLowerCase();
		
		int total1 = 0;
		int total2 = 0;
		if (one.length() == two.length()) {
			for (int i = 0; i < one.length() - 1; i++) {
				total1 = (one.charAt(i) != ' ') ? total1 + 1 : total1;
				total2 = (two.charAt(i) != ' ') ? total2 + 1 : total2;
			}
			String result = (total1 == total2) ? "Words are anagram" : "Words are NOT anagram";
			System.out.println(result);
		} else {
			System.out.println("Words are NOT anagram");
		}
		
		/*
		Java Program to divide a string in 'N' equal parts.
		 */
		String s = "qweoiweeteooiiiiyy";
		int n = 0;
		
		if (s.length() % 2 == 0) {
			for (int i = 2; true; i++) {
				
				if (s.length() % i == 0) {
					n = i;
					
				} else {
					break;
				}
			}
		} else {
			System.out.println("Error");
		}
		int temp = 0;
		String[] equalsPart = new String[n];
		for (int i = 0; i < s.length(); i += s.length() / n) {
			String part = s.substring(i, i + s.length() / n);
			equalsPart[temp] = part;
			temp++;
		}
		System.out.println(Arrays.toString(equalsPart));
		
		//Java Program to find all subsets of a string
		String w = "life";
		String[] arr = new String[w.length() * (w.length() + 1) / 2];
		int temp1 = 0;
		for (int i = 0; i < w.length(); i++) {
			for (int j = i; j < w.length(); j++) {
				arr[temp1] = w.substring(i, j + 1);
				temp1++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		//swap two Strings
		String a = "qwerty";
		String b = "poiuyu";
		a = a.concat(b);
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println(a + " " + b);
		
		
		//separate each character with space
		String p = "world";
		StringBuilder sb = new StringBuilder();
		for (char c : p.toCharArray()) {
			sb.append(c).append(" ");
		}
		System.out.println(sb.toString().trim());
		
		
		//print biggest and smallest palindrome;
		String u = "Wow you own kayak";
		String biggest = "";
		String smallest = u;
		for (String l : u.split("\\s")) {
			var str = new StringBuilder(l).reverse();
			if (l.equalsIgnoreCase(str.toString())) {
				if (l.length() < smallest.length()) {
					smallest = l;
				} else if (l.length() > biggest.length()) {
					biggest = l;
				}
			}
		}
		System.out.println("Biggest is " + biggest + "\nSmallest is " + smallest);
		
		//find repeated words in doc
		String[] words = {"computer", "program", "is", "usually", "written", "by", "computer", "programmer",
				"in", "programming", "language"};
		
		List<String> list;
		list = Arrays.stream(words).toList();
		
		Map<String, Integer> map = new HashMap<>();
		for (String qw : list) {
			if (map.get(qw) != null) {
				int count = map.get(qw);
				map.put(qw, ++count);
			} else {
				map.put(qw, 1);
			}
		}
		map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.limit(1)
				.forEach(System.out::print);
		
		//frequency od char in string
		String word3 = "The world is mine.";
		Map<Character, Integer> map1 = new HashMap<>();
		word3 = word3.replaceAll("[.\\s]", "");
		
		for (Character c : word3.toCharArray()) {
			if (map1.containsKey(c)) {
				int count = map1.get(c);
				map1.put(c, ++count);
			} else {
				map1.put(c, 1);
			}
		}
		map1.forEach((k, v) -> System.out.println(k + "=" + v));
		
		//reverse string without reverse()
		String example = "this is word to reverse";
		String [] array = example.split("\\s");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]+" ");
		}
	}
}