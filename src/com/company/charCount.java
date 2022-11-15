package com.company;



import java.util.HashMap;
import java.util.Map;

public class charCount {
	public static void main(String[] args) {
		String str = "hkgjd9834fhsd?>><>??)((()()fklsd";
		System.out.println(getCount(str));
	}
	
	public static Map<Character, Integer> getCount(String str) {
		char[] charArr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : charArr) {
			if (map.get(c) == null) {
				map.put(c, 1);
			}else{
				int count =map.get(c);
				count=count+1;
				map.put(c,count);
			}
		}return map;
	}
	
}
