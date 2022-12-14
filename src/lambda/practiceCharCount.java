package lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.*;

public class practiceCharCount {
	public static void main(String[] args) {
	Scanner scan = new Scanner (in);
	String word=scan.next();
	
	HashMap<Character,Integer>charCount=new HashMap<>(findReatingCharacter(word));
	displayMap(charCount);
	
	}
	public static Map<Character,Integer>findReatingCharacter(String str){
		Map<Character,Integer>map = new HashMap<>();
		char[]charArr=str.toCharArray();
		
		for (char c:charArr
			 ) {
			if(map.get(c)==null) {
				map.put(c,1);
			}else{
				int count=map.get(c);
				count++;
				map.put(c,count);
			}
		}return map;
	}
	public static void displayMap(Map<Character,Integer>map){
		map.forEach((s,q)->out.println(s+"= "+q));
	}
	
}
