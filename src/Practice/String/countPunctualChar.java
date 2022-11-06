package Practice.String;
/*
 Java Program to count the total number of punctuation characters exists in a String
 */

public class countPunctualChar {
	public static void main(String[] args) {
		
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
		
		
	}
}

//97 122