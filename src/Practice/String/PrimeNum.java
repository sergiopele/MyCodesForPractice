package Practice.String;
/*Write a Java program to check if a given number is prime or not.
Remember, a prime number is a number which is not divisible by any other number, e.g. 3, 5, 7, 11, 13, 17, etc.
Be prepared for cross, e.g. checking till the square root of a number, etc.

*/

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int flag = 0;
		String result;
		
		if (num < 3) {
			flag++;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag++;
					break;
				}
				
				break;
			}
			
		}
		result = (flag > 0) ? "Number is NOT prime" : "Number is prime";
		System.out.println(result);
		scan.close();
	}
}
