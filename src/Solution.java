import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
		//.forEach(System.out::println);
		//System.out.println(lastChars("last","chars"));
		
		System.out.println(detectCapitalUse("FlaG"));
	}
	
	class Solution {
		public boolean wordPattern(String pattern, String s) {
			String [] S = s.split("\\s+");
			char [] C = pattern.toCharArray();
			
			Set<String> stringSet = new HashSet<>();
			Set<Character> charSet = new HashSet<>();
			for(String sArr : S){
				stringSet.add(sArr);
			}
			for(Character cArr : C){
				charSet.add(cArr);
			}
			if(stringSet.size()!=charSet.size()) return false;
			
			Map <Character, String> map = new HashMap<>();
			for(int i = 0; i < stringSet.size(); i++){
				map.put(charSet., stringSet.get(i));
			}
			for(int i = 0; i < S.length; i++){
				
				if(!map.get(C[i]).equals(S[i])){
					return false;
				}
			}
			return true;
			
		}
	}
}
	
	


