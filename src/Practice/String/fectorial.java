package Practice.String;

import java.util.ArrayList;
import java.util.Arrays;

public class fectorial {
	public static void main(String[] args) {
		//duplicate from arrayList
		String word = "Great teart";
		int count;
		char[]dublicate=word.toCharArray();
		for (int i = 0; i < word.length(); i++) {
			count=1;
			for (int j = i+1; j < word.length(); j++) {
				if(word.charAt(i)==word.charAt(j)){
				count++;
				dublicate[j]='o';
				}
			}
			if(count>1&&dublicate[i]!='o'){
				System.out.println(dublicate[i]);
			}
		}
		
		
	
	}
}
