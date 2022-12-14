package Practice.String;

import java.util.Arrays;

public class sortArrayBubble {
	public static void main(String[] args) {
		int[] num = {1, 4, 6, 8, 3, 7, 9, 4, 2, 7, 9,};
		System.out.println(Arrays.toString(sortingArr(num)));
		
	}
	
	public static int[] sortingArr(int[] num) {
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j < num.length - i; j++) {
				
				if (num[j - 1] > num[j]) {
					int temp = num[j - 1];
					num[j - 1] = num[j];
					num[j] = temp;
				}
			}
		}
		return num;
	}
}
